(ns exercise9
	(:require [clojure.string :as string]))

(defn word-count 
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (->> (re-seq #"\w+" x)
       (map string/lower-case)
       frequencies)
)