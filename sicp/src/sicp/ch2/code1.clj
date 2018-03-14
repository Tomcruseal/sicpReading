(ns ch2.code1
    (:use [clojure.repl])
    (:gen-class)
    (:use [ch2.scons]))

(defn make-rat [n d]
    (scons n d))

(defn numer [x] (scar x)

(defn denom [x] (scdr x)

(defn add-rat [x y]
    (make-rat (+ (* (numer x) (denom y)) 
    (* (numer y) (denom x)))
    (* (denom x)(denom y))))

(defn sub-rat [x y]
    (make-rat (- (* (numer x)(denom y))
    (* (numer y)(denom x)))
    (* (denom x)(denom y))))

(defn mul-rat [x y]
    (make-rat (* (numer x)(numer y))
    (* (denom x)(denom y))))

(defn equal-rat? [x y]
    (= (* (numer x)(denom y))
        (* (numer y)(denom x))))
