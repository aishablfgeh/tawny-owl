(ns
    ^{:doc "Arabic translation of Tawny OWL. Currently in process"
      :author "Aisha Blfgeh"}
    tawny.arabic
  (:require
   [tawny.owl :as o]
   [tawny.polyglot :as p]))

(def arabic-translation-map
  {
   :ontology :أنتولوجيا

   ;; ontology handler
   :noname :بدون-اسم
   :iri :آي-آر-آي
   :prefix :بادئة
   :name :الاسم
   :seealso :انظر-أيضا
   :comment :تعليق
   :versioninfo :الإصدار
   :annotation :التدوين
   :import :جلب

   ;; annotation handler
   ;; same as :super
   :label :علامة

   ;; subject property
   :domain :المجال
   :range :المدى
   :inverse :عكسي
   :characteristic :ميزة
   :subchain :متسلسل-من
   :disjoint :منفصل
   :equivalent :مساوي

   ;; class  الصنف
   :haskey :مفتاحه
   :subclass :متفرع-من

   ;; individual  المثال
   :type :نوع
   :fact :حقيقة
   :same :مثل
   :different :مختلف})

(defn العربية [f]
  (p/polyglot-trans f arabic-translation-map))

(def الأنتولوجيا
  (العربية o/ontology))

(defmacro عرف-الأنتولوجيا
  "تعريف الأنتولوجيا واعطاءها اسم معرف لها
  البيانات التالية يجب إضافتها مع التعريف:
  الاسم: وهو الاسم المعرف
  أي معاملات أخرى ذات العلاقة مثل :بادئة و :آي-آر-آي وغيره"
  [name & arga]
  (o/ontology-def-f name arga))

(def خاصية-التدوين
  (العربية o/annotation-property))

(o/defentity عرف-خاصية-التدوين
  "تعريف خاصية تدوين جديدة للأنتولوجيا الحالية
   والمزيد من التفاصيل موجودة في مدونة (تعريف الصنف) الموجودة في....."
  'tawny.arabic/خاصية-التدوين)

(def خاصية-الكائن
  (العربية o/object-property))

(o/defentity عرف-خاصية-الكائن
  "تعريف خاصية كائن جديدة للأنتولوجيا الحالية"
  #'tawny.arabic/خاصية-الكائن)

(def خاصية-البيانات
  (العربية o/datatype-property))

(o/defentity عرف-خاصية-البيانات
  "تعريف خاصية بيانات جديدة للأنتولوجيا الحالية"
  #'tawny.arabic/خاصية-البيانات)

(def المثال
  (العربية o/individual))

(o/defentity عرف-المثال
  "Declare a new individual"
  'tawny.arabic/المثال)

(def نوع-بيانات
  (العربية o/datatype))

(o/defentity عرف-نوع-بيانات
  "تعريف نوع جديد من البيانات"
  'tawny.arabic/نوع-بيانات)

(def الصنف
  (العربية o/owl-class))

(o/defentity عرف-الصنف
  "تعريف صنف جديد في الأنتولوجيا الحالية"
  #'tawny.arabic/الصنف)
