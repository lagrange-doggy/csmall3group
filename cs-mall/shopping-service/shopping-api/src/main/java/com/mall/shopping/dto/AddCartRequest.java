package com.mall.shopping.dto;

import com.mall.commons.result.AbstractRequest;
import lombok.Data;

/**
 * Created by ciggar on 2019/7/23.
 */
@Data
public class AddCartRequest extends AbstractRequest{

    private Long userId;
    private Long productId;
    private Integer productNum;

    @Override
    public void requestCheck() {

    }
}
