package com.netflix.commons.kafka.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 10/11/2019 17:11
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreatedDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long orderId;
    private OrderStatusDto orderStatus;
    private Long clientId;

}
