(ns ch2.abpair
    (:use [clojure.repl])
    (:gen-class))

(defn square [x]
    (* x x))

(defn exp [x n]
    (cond (= n 0) 1
          (even? n) (square (exp x (/ n 2)))
          :else (* x (exp x (- n 1)))))

(defn scons [a b]
    (* (exp 2 a)
       (exp 3 b)))

(defn factor [base-x product-y]
    (loop [i product-y
           acc 0]
           (if-not (zero? (rem i base-x))
               acc
               (recur (/ i base-x) (inc acc))))
)

;(defn factor
;  [base n]
;  (loop [i n
;         acc 0]
;    (if (zero? (rem i base))
;      (recur (/ i base) (inc acc))
;      acc)))
;;this snippet of code is from  v-kolesnikov
;;I was no longer confused by referring to his code


(defn scar [z]
    (factor 2 z))

(defn scdr [z] 
    (factor 3 z))

(println (scar 64))