package ru.itpark.service;

import org.springframework.stereotype.Service;

@Service
public class CashbackService {

    public int cashBack(int sumCategorySimple, int sumCategoryPriority, int sumCategorySuper) {


        int categoryPriorityPercent = 5;
        int categorySuperPercent = 30;
        int resultLimit = 3_000;
        int resultCommon = (sumCategorySimple + sumCategoryPriority * categoryPriorityPercent + sumCategorySuper * categorySuperPercent) / 100;


        if (resultCommon > resultLimit) {
            return resultLimit;
        }

        return resultCommon;

    }
}