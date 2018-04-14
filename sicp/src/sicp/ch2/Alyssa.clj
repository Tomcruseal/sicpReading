(ns ch2.Alyssa
    (:use [clojure.repl])
    (:gen-class))

(defn add-interval [x y]
    (make-interval (+ (lower-bound x) (lower-bound y))
                   (+ (upper-bound x) (upper-bound y))))

(defn mul-interval [x y]
    (let [p1 (* (lower-bound x)(lower-bound y))
          p2 (* (lower-bound x)(lower-bound y))
          p3 (* (upper-bound x)(lower-bound y))
          p4 (* (upper-bound x)(upper-bound y))]
        (make-interval(min p1 p2 p3 p4)(max p1 p2 p3 p4))))

(defn div-interval [x y]
    (multi-interval x 
        (make-interval (/ 1.0 (upper-bound y))(/ 1.0 (lower-bound y)))))

(defn make-interval [a b] (scons a b))

(defn upper-interval [b] (scdr b))
(defn lower-interval [a] (scar a))

(defn scons [x y]
    (fn [n] (cond (= 0 n)x
                  (= 1 n)y
                  )))

(defn scar [x] (x 0))

(defn scdr [x] (x 1))

;;exercise 2.8
(defn sub-interval [x y]
    (add-interval x 
        (make-interval (- 0 (upper-bound y))(- 0 (lower-bound y)))))

;;exercise 2.9
;;Obviously

;;exercise 2.10
;;if x is divided by y where y spans 0, it is then meanlingless
(defn div-interval-im [x y]
    (if (< 0 (/ (upper-bound y)(lower-bound y)))
        0
        (mul-interval x 
            (make-interval (/ 1.0 (upper-bound y))(/ 1.0 (lower-bound y))))))

;;exercise 2.11
