-- listsテーブルを削除する
DROP TABLE IF EXISTS lists;
-- listsテーブルの作成
CREATE TABLE lists (
    id INT	NOT NULL AUTO_INCREMENT, -- ID
    title VARCHAR(255) NOT NULL, -- タイトル
    userid
);
-- データの挿入
INSERT INTO listss (id, title)
VALUES (0, '洗濯物を干す');
