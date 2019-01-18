package ru.itpark;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import ru.itpark.service.CashbackService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TinkofSpringApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    void cashBack() {

        {
            CashbackService service = new CashbackService();

            int cashBack = service.cashBack(0, 0, 0);
            assertEquals(0, cashBack);
        }
        {
            CashbackService service = new CashbackService();

            int cashBack = service.cashBack(1_400, 15_000, 7_000);
            assertEquals(2_864, cashBack);
        }
        {
            CashbackService service = new CashbackService();

            int cashBack = service.cashBack(15_000, 15_000, 7_000);
            assertEquals(3000, cashBack);
        }
        {
            CashbackService service = new CashbackService();

            int cashBack = service.cashBack(15_000, 15_001, 7_000);
            assertEquals(3_000, cashBack);
        }
        {
            CashbackService service = new CashbackService();

            int cashBack = service.cashBack(15_000, 15_000, 7_001);
            assertEquals(3_000, cashBack);
        }
        {
            CashbackService service = new CashbackService();

            int cashBack = service.cashBack(16_000, 15_000, 7_000);
            assertEquals(3_000, cashBack);
        }

    }


}

