(ns ch1.exOne16
    (:use [clojure.repl])
    (:gen-class))

;;different approaches to compute the  multi power
;;since b^n = b * b^{n-1}, it is natural:
(defn expt1 [b n]
    (if (= n 0)
        1
        (* b (expt1 b (- n 1)))))

;;cosumes \Theta(n) time and \Theta(n) space
;;if convert the above implement to iteration, can simply add a count

(defn expt2 [b n]
    (expt-helper b n 1))

(defn expt-helper [b count product]
    (if (= count 0)
        product
        expt-helper b (- n 1)
                        (* b product)))

;;However,faster method exists
(defn fast-expt [b n]
    (cond (= n 0) 1
          (even? n) (square (fast-expt b (/ n 2)))
          :else (* b (fast-expt b (- n 1)))))

(defn even? [n]
    (= (remainder n 2) 0))
;;yields to \Theta(\logn)

(defn fast-expt2 [b n]
    (fast-iter 1 b n))

(defn fast-iter [product b n]
    (cond (= n 0) product
        (even? n) (fast-iter product (square b) (/ n 2))
        :else (fast-iter (* product b) b (- n 1))))
;;这里的迭代类似与尾递归，它的计算过程是迭代的，但该过程本身是递归的
;;product是一个状态变量，在状态转换的时候ab^n的值保持不变，当然a,b,n
;;是变量