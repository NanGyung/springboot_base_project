package com.kh.myproduct.web;

import com.kh.myproduct.dao.Product;
import com.kh.myproduct.svc.ProductSVC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
//@RequiredArgsConstructor  //final 멤버 필드를 매개값으로 하는 생성자를 자동생성
public class ProductController {

  private final ProductSVC productSVC;

  public ProductController(ProductSVC productSVC) {
    this.productSVC = productSVC;
  }

  //등록양식
  @GetMapping("/add")
  public String saveForm(){
    Product product = new Product();
    Long save = productSVC.save(product);

    return "product/saveForm";
  }

  //등록처리
  @PostMapping("/add")
  public String save(){
    return "redirect:/products/{id}/detail";
  }

  //조회
  @GetMapping("/{id}/detail")
  public String findById(){
    return "product/detailForm";
  }

  //수정양식
  @GetMapping("/{id}/edit")
  public String updateForm(){
    return "product/updateForm";
  }

  //수정처리
  @PostMapping("/{id}/edit")
  public String update(){
    return "redirect: /products/{id}/detail";
  }

  //삭제
  @GetMapping("/{id}/del")
  public String deleteById(){
    return "redirect: /products";
  }

  //목록
  @GetMapping
  public String findAll(){
    return "product/all";
  }
}
