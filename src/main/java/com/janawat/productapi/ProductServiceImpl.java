package com.janawat.productapi;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProdustService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @Transactional(readOnly = true)
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ProductDTO getProductById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional
                .map((element) -> modelMapper.map(element, ProductDTO.class))
                .orElse(null);
    }

    @Override
    @Transactional
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = modelMapper.map(productDTO,Product.class);
        Product saveProduct = productRepository.save(product);


        return modelMapper.map(saveProduct,ProductDTO.class);
    }

    @Override
    @Transactional
    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product exitingProduct = productOptional.get();
            exitingProduct.setName(productDTO.getName());
            exitingProduct.setPrice(productDTO.getPrice());

            Product updateProduct = productRepository.save(exitingProduct);
            return modelMapper.map(updateProduct, ProductDTO.class);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
