package com.example.fishing_log.service;

import com.example.fishing_log.entity.Catch;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CatchService {

    // メモリ上に釣果を保持するリスト（後でDBに置き換えられます）
    private final List<Catch> store = new ArrayList<>();

    /**
     * 全件取得
     */
    public List<Catch> findAll() {
        // イミュータブルなリストを返して外部からの改変を防止
        return Collections.unmodifiableList(store);
    }

    /**
     * 1件保存
     */
    public void save(Catch catchForm) {
        store.add(catchForm);
    }
}