(ns ch1.exOne29
    (:use [clojure.repl])
    (:gen-class))

;;
(defn sum-cus [term a next b]
    (if (> a b) 0
        (+ (term a)
            (sum-cus term (next a) next b))))

;;平方和
(defn sum-cubes [a b]
    (sum-cus cube a inc b))

;;[a b]之间整数的和
(defn sum-integers [a b]
    (sum-cus identity a inc b))

