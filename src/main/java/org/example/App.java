package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // コントローラクラスであることを示す。
@EnableAutoConfiguration // 設定の自動化
public class App
{
    @RequestMapping("/")    // URLが"/"であるアクセスとの紐付け
    String home() {
        return "Hello world!";  // RestController
        // アノテーションの付いたクラスのメソッドで文字列を返す＝返り値をHTTPとして出力
 }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}