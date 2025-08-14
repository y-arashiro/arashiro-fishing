package com.example.fishing_log.repository;

import com.example.fishing_log.entity.Catch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Catch エンティティの永続化操作を提供するリポジトリ
 */
@Repository  
public interface CatchRepository extends JpaRepository<Catch, Long> {
    // 継承だけで基本的な CRUD メソッドが使えるようになる

    // 例：魚種で検索するメソッドを自動生成させたい場合
    // List<Catch> findBySpecies(String species);
}