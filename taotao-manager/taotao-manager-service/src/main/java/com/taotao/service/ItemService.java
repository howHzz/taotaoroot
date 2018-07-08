package com.taotao.service;

import com.taotao.pojo.TbItem;
import org.springframework.stereotype.Service;


public interface ItemService {
    TbItem getItemById(long id);
}
