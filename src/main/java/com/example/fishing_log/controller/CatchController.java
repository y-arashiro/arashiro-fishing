package com.example.fishing_log.controller;

import com.example.fishing_log.entity.Catch;
import com.example.fishing_log.service.CatchService;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/catch")
public class CatchController {

    private final CatchService catchService;

    public CatchController(CatchService catchService) {
        this.catchService = catchService;
    }

    // 釣果一覧ページ（GET /catch/list）
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("catches", catchService.findAll());
        return "catch-list";
    }

    // 釣果登録フォーム表示（GET /catch/form）
    @GetMapping({"/form", "/new"})
    public String form(Model model) {
        model.addAttribute("catch", new Catch());
        return "catch-form";
    }

    // 釣果登録処理（POST /catch/submit）
    @PostMapping("/submit")
    public String submit(
            @ModelAttribute("catch") Catch catchForm,
            BindingResult bindingResult,
            Model model) {

        // バリデーションエラー時はフォームに戻す
        if (bindingResult.hasErrors()) {
            return "catch-form";
        }

        // 保存ロジック（DB ならリポジトリ save(), メモリならリスト追加 ）
        catchService.save(catchForm);

        // 登録後は一覧へリダイレクト
        return "redirect:/catch/list";
    }
}