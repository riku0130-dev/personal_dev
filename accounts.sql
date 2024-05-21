-- accountsテーブルを削除する
DROP TABLE IF EXISTS accounts;
-- accountsテーブルの作成
CREATE TABLE accounts (
    id INT	NOT NULL AUTO_INCREMENT, -- ID
    user_id VARCHAR(255) NOT NULL, -- ユーザーID
    password VARCHAR(255) NOT NULL, -- パスワード
    PRIMARY KEY (id)
);
-- データの挿入
INSERT INTO accounts (id, user_id, password)
VALUES (0, 'test', 'Abcd1234');
