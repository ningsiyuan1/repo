package io.nsy.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.nsy.jcartstoreback.dto.out.ProductListOutDTO;
import io.nsy.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
