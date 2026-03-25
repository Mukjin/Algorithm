SELECT 
    A.ID,                     -- 부모 ID
    COUNT(B.ID) AS CHILD_COUNT  -- 자식 개수 (NULL 제외 → 자동 0)
FROM ECOLI_DATA A

LEFT JOIN ECOLI_DATA B        -- 자기 자신과 조인 (부모-자식)
    ON A.ID = B.PARENT_ID     -- 부모 = 자식의 부모ID

GROUP BY A.ID                 -- 부모 기준 그룹화
ORDER BY A.ID;                -- 오름차순 정렬