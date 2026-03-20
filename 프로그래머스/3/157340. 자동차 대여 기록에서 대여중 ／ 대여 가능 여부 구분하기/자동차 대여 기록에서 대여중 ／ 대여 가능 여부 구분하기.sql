SELECT 
    CAR_ID,
    CASE 
        -- 2. 현재 차가 '10월 16일 대여 중인 차 목록'에 포함되는지 확인
        WHEN CAR_ID IN (
            -- 1. 2022년 10월 16일에 대여 중인 자동차 ID만 쏙 뽑아오기 (서브쿼리)
            SELECT CAR_ID
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
            WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
        ) THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY 
    CAR_ID
ORDER BY 
    CAR_ID DESC;