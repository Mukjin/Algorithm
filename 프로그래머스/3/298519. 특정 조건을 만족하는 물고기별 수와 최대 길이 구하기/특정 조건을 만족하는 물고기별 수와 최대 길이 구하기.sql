SELECT 
    COUNT(*) AS FISH_COUNT,                 -- 물고기 수
    MAX(LENGTH) AS MAX_LENGTH,              -- 최대 길이
    FISH_TYPE                               -- 물고기 종류
FROM FISH_INFO
GROUP BY FISH_TYPE                          -- 종류별 그룹화
HAVING AVG(COALESCE(LENGTH, 10)) >= 33      -- 평균 길이 조건
ORDER BY FISH_TYPE ASC;                     -- 오름차순 정렬