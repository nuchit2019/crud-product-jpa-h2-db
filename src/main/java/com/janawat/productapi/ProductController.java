package com.janawat.productapi;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@Validated
public class ProductController {
    @Autowired
    private ProdustService produstService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProduct() {
        List<ProductDTO> products = produstService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        ProductDTO product = produstService.getProductById(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @PostMapping
    public ResponseEntity<ProductDTO>createProduct(@Valid @RequestBody ProductDTO productDTO){
        ProductDTO createProduct = produstService.createProduct(productDTO);
        return new ResponseEntity<>(createProduct,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long id,@RequestBody ProductDTO productDTO){
        ProductDTO updateProduct = produstService.updateProduct(id,productDTO);
        if(updateProduct!=null){
            return new ResponseEntity<>(updateProduct,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        produstService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
