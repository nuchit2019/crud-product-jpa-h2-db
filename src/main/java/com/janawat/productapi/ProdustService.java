package com.janawat.productapi;

import java.util.List;

public interface ProdustService {
    List<ProductDTO> getAllProducts();
    ProductDTO getProductById(Long id);
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO updateProduct(Long id,ProductDTO productDTO);
    void deleteProduct(Long id);
}
