(ns app.hello
  (:require
   [reagent.core :as r]
   [refn.core :as rf :refer [<< >>]]
   [app.subs :as subs]
   [app.events :as events]))

(defn click-counter [click-count]
  [:div
   "The atom " [:code "click-count"] " has value: "
   @click-count ". "
   [:input {:type "button" :value "Click me!"
            :on-click #(swap! click-count inc)}]])

(defn click-rf-counter []
  (let [count (<< [:rf-count])]
    [:div
     "App-DB " [:code "rf-count"] " has value: "
     count ". "
     [:input {:type "button" :value "Click me!"
              :on-click #(>> [:rf-count (inc count)])}]]))

(def click-count (r/atom 0))

(defn hello []
  [:<>
   [:p "Hello, cljs-shadow-reframe-reagent is running!"]
   [:p "Here's an example of using a component with state:"]
   [click-counter click-count]

   [:p "Here's an example of using a component with re-frame app-db state:"]
   [click-rf-counter]])
