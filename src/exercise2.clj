(ns exercise2)

(defn only-greater-than-five
  "Filters the input list returning only the elements greater than 5."
  [x]
  (filter (fn [element] (> element 5)) x )
)




