(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result fo the given input value."
  [x]
	(if (> x 1) (+ (fibonacci(- x 1)) (fibonacci(- x 2)))
    (if (= x 1) 1
      (if (= x 0) 0)))
)
