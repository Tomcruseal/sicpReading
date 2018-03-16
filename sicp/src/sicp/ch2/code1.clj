(ns ch2.code1
    (:use [clojure.repl])
    (:gen-class))

(defn scons [x y]
    (fn [m]
        (cond (= m 0) x
              (= m 1) y)))

(defn scar [z] (z 0))

(defn scdr [z] (z 1))

(defn abs [x]
    (if (> x 0) x
        (- 0 x)))

(defn gcd "(gcd a b) returns the greatest common divisor of a and b" [a b]
  (if (or (not (integer? a)) (not (integer? b)))
    (throw (IllegalArgumentException. "gcd requires two integers"))  
    (loop [a (abs a) b (abs b)]
      (if (zero? b) a,
	  (recur b (mod a b))))))

(defn make-rat-non-check [n d]
    (scons n d))

(defn numer [x] (scar x))

(defn denom [x] (scdr x))

(defn make-rat[n d]
    (let [g (gcd n d)]
        (scons (/ n g) (/ d g))))    ;n is nomer, d is denom

(defn make-rat [n d]
    (let [g (gcd n d)]
        (cond (and (> n 0) (> d 0)) (scons (/ n g) (/ d g))
              (and (< n 0) (< d 0)) (scons (- 0 (/ n g)) (- 0 (/ d g)))
              (and (< n 0) (> d 0)) (scons (/ n g) (/ d g))
              :else (scons (- 0 (/ n g)) (- 0 (/ d g))))))

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

;;make rational numbers



(def rationalA (make-rat 2 -3))

(defn print-rat [x]
    (newline)
    (print (numer x))
    (print "/")
    (print (denom x)))

(print-rat rationalA)