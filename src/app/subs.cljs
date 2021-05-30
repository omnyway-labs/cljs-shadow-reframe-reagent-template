(ns app.subs
  (:require
   [re-frame.core :as rf]
   [refn.core :refer [defsub]]))

(defsub :rf-count)
