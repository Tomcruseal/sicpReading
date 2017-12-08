(ns ch1.exOne20
    (:use [clojure.repl])
    (:gen-class))
;;GCD(a,b)==GCD(b,r) where r is the remainder of a/b
;;Euclidean
(defn gcd [a b]
    (if (= b 0) a
        (gcd b (rem a b))))

;;对于(gcd 206 40)，若采用正则序求值则实际执行6次remainder运算，
;;采用应用序则实际执行了4次remainder运算
