package com.example.order.controller.dto;

import com.example.order.factory.OrderEntityFactory;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderResponseTest {

    @Nested
    class fromEntity {

        @Test
        void shouldMapCorrectly() {
            //ARRANGE
            var input = OrderEntityFactory.build();
            //ACT
            var output = OrderResponse.fromEntity(input);

            //ASSERT
            assertEquals(input.getOrderId(), output.orderId());
            assertEquals(input.getCustomerId(), output.customerId());
            assertEquals(input.getTotal(), output.total());
        }
    }

}