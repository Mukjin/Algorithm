import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        
        // 1. 스포 방지 구간 정렬 및 병합 (Merge Intervals)
        // 겹치는 스포 구간을 하나의 큰 구간으로 합쳐줍니다.
        List<int[]> mergedRanges = new ArrayList<>();
        if (spoiler_ranges.length > 0) {
            Arrays.sort(spoiler_ranges, (a, b) -> a[0] - b[0]);
            for (int[] r : spoiler_ranges) {
                if (mergedRanges.isEmpty()) {
                    mergedRanges.add(new int[]{r[0], r[1]});
                } else {
                    int[] last = mergedRanges.get(mergedRanges.size() - 1);
                    // 현재 구간이 이전 구간과 겹친다면 하나로 병합
                    if (r[0] <= last[1]) {
                        last[1] = Math.max(last[1], r[1]);
                    } else {
                        mergedRanges.add(new int[]{r[0], r[1]});
                    }
                }
            }
        }
        
        Set<String> spoilerWords = new HashSet<>();
        Set<String> nonSpoilerWords = new HashSet<>();
        
        int n = message.length();
        int wordStart = -1;
        int rangeIdx = 0;
        
        // 2. 메시지를 순회하며 단어 추출 및 분류
        for (int i = 0; i <= n; i++) {
            // 공백을 만나거나 문자열의 끝에 도달했을 때 단어를 자릅니다.
            if (i == n || message.charAt(i) == ' ') {
                if (wordStart != -1) {
                    String word = message.substring(wordStart, i);
                    int wordEnd = i - 1; // 단어의 끝 인덱스 (포함)
                    
                    boolean isSpoiler = false;
                    
                    // 3. 투 포인터를 이용한 겹침 판별 (O(N) 속도 보장)
                    // 구간이 현재 단어보다 완전히 앞에 있다면 다음 구간으로 넘어감
                    while (rangeIdx < mergedRanges.size() && mergedRanges.get(rangeIdx)[1] < wordStart) {
                        rangeIdx++;
                    }
                    
                    // 구간이 남아있고, 그 구간의 시작점이 단어의 끝점 이하라면 겹친 것!
                    if (rangeIdx < mergedRanges.size()) {
                        int[] currRange = mergedRanges.get(rangeIdx);
                        if (currRange[0] <= wordEnd) {
                            isSpoiler = true;
                        }
                    }
                    
                    // 스포 여부에 따라 각각의 Set에 담기
                    if (isSpoiler) {
                        spoilerWords.add(word);
                    } else {
                        nonSpoilerWords.add(word);
                    }
                    
                    wordStart = -1; // 다음 단어를 위해 시작점 초기화
                }
            } else {
                if (wordStart == -1) {
                    wordStart = i; // 단어의 시작 인덱스 기록
                }
            }
        }
        
        // 4. 중요한 단어 개수 도출
        int importantCount = 0;
        for (String word : spoilerWords) {
            // 스포 단어 목록에 있으면서, 일반 단어 목록에는 없는 단어만 카운트!
            if (!nonSpoilerWords.contains(word)) {
                importantCount++;
            }
        }
        
        return importantCount;
    }
}