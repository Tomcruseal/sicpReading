(ns ch1.exOne10
    (:use [clojure.repl])
    (:gen-class))

(defn Ackermann [x y]
    (cond (= y 0) 0
          (= x 0) (* 2 y)
          (= y 1) 2
          :else (Ackermann (- x 1)
                  (Ackermann x (- y 1)))))

;;according to the test,(Ackermann 1 10) yields to 1024,
;;(Ackermann 2 4) yields to 65536 and (Ackermann 3 3)
;;also yields to 65536 震惊
;;below is function f,g,h,and k of the textbook

(defn f [n]
    (Ackermann 0 n))

(defn g [n]
    (Ackermann 1 n))

(defn h [n]
    (Ackermann 2 n))

(defn k [n]
    (* 5 n n))

;;according to the limited numbers of tests, I can infer that 
;;f(n)=2n,g(n)=2^{n}(both exceeded 0) k(n)=5n^2
;;h(n) the layer of power
;;需要看到这是所谓的双递归函数，即有一个参数也是递归函数