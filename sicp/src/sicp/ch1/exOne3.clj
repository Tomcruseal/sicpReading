(ns ch1.exOne3
    (:use [clojure.repl])
    (:gen-class))


;(defn demo [x y](* x y))

;(defn donkey [a b](+ a (demo b b)))

;(def nn (demo 2 3))
;(def cc (donkey 2 3))
;(println  nn)
;(println cc)
(defn user-square [x]
(* x x))

(defn sum-of-squares [x y]
(+ (user-square x) (user-square y)))

(defn bigger-two [x y z]
(cond 
      (and (< x y) (< x z)) (sum-of-squares y z)
      (and (< y x) (< y z)) (sum-of-squares x z)
      (and (< z x) (< z y)) (sum-of-squares x y)
      :else (println "error haha")
      ))


