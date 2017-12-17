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

;;this will yield a (1/8)*\pi as x \leftarrow \inf
(defn pi-sum [a b]
    (defn pi-term [x]
        (/ 1.0 (* x (+ x 2))))
    (defn pi-next [x]
        (+ x 4))
    (sum-cus pi-term a pi-next b))

;;integral approaximation
(defn integral-cus [f a b dx]
    (defn add-dx [x] (+ x dx))
    (* (sum-cus f (+ a (/ dx 2.0)) add-dx b)
        dx))



