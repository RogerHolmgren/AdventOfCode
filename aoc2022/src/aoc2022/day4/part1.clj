(ns aoc2022.day4.part1 
  (:require
    [clojure.string :as str]))

(def input (slurp "src/aoc2022/day4/test-data"))
; (def input (slurp "src/aoc2022/day4/data"))

(defn is-overlapping [pairs-string]
  (let [pairs (str/split pairs-string #",")
        left (str/split (first pairs) #"-")
        right (str/split (second pairs) #"-")
        ]
    (println (+ (Integer/parseInt (first left)) (Integer/parseInt (second left))))
    left
    ))

(defn count-overlapping-pairs
  [list]
  (->> (str/split-lines list)
       (map #(is-overlapping %))
       ))

(count-overlapping-pairs input)

(+ (Integer/parseInt "1") 1)

(->>
  input
  (str/split-lines)
  (map #(str/split % #","))
  (map #(str/split % #"-"))
  )
