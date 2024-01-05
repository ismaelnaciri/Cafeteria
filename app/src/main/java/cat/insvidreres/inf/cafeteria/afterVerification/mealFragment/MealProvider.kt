package cat.insvidreres.inf.cafeteria.afterVerification.mealFragment

class MealProvider {
    companion object {
        fun loadMeals(): List<Meal> {
            return listOf<Meal>(
                Meal(
                    "Truita de Patates",
                    23.99, "Molt bona recomended by poffor",
                    "https://media.istockphoto.com/id/1425016354/es/foto/tortilla-de-patatas-y-varios-ingredientes-sobre-mesa-de-madera-oscura-concepto-de-comida.jpg?s=612x612&w=0&k=20&c=cYhpV4ZC8V4EkpJB6ZlLMxOdbVEyuiihUSMgu0UjDd0="),
                Meal(
                    "Pota d'Ànec amb condiments",
                    17.88,
                    "Pota d'ànec ben servida",
                    "https://media.istockphoto.com/id/1150368715/es/foto/pata-de-pato-confit.jpg?s=612x612&w=0&k=20&c=OQ8Hd3kKRwNfL7LgsuShDbpw2WU89M5gmDyYB9LS0II="),
                Meal(
                    "Chickend Breast and Vegetables",
                    15.00,
                    "rip chicken",
                    "https://media.istockphoto.com/id/928823336/es/foto/pechuga-de-pollo-a-la-plancha-filete-de-pollo-frito-y-ensalada-fresca-de-tomates-pepinos-y.jpg?s=612x612&w=0&k=20&c=YjUaGwMSHNjxEHsXGVWwnS10ZmcSqL8wONCV2bmhkIU="),
                Meal(
                    "Bacallà",
                    16.77,
                    "notificatio go brrrrrrrrrrrrr",
                    "https://media.istockphoto.com/id/538045178/es/foto/codfish.jpg?s=612x612&w=0&k=20&c=TBuYnjpAcQL_IiaadTU8Hkrn8BeU9aA7ORn-h2O4Jbk="),
                Meal(
                    "Hamburguesa de pollastre",
                    17.00,
                    "yep bigMac lookalike",
                    "https://media.istockphoto.com/id/1309352410/es/foto/hamburguesa-con-queso-con-tomate-y-lechuga-en-tabla-de-madera.jpg?s=612x612&w=0&k=20&c=HaSLXFFns4_IHfbvWY7_FX7tlccVjl0s0BrlqaLHOTE="),
                Meal(
                    "Fries",
                    8900.09,
                    "1",
                    "https://media.istockphoto.com/id/966934632/es/foto/apetitosas-papas-fritas-en-un-recipiente.jpg?s=612x612&w=0&k=20&c=E3Vodi6o-Vn9z8IarCwUoxOgoda4NPLOoue5v8dknGg="),
                Meal(
                    "Steak",
                    89786.09,
                    "2",
                    "https://media.istockphoto.com/id/1371751060/es/foto/bistec-de-ternera-de-solomillo-o-filete-de-rabadilla-a-la-parrilla-medium-rare-en-una-bandeja.jpg?s=612x612&w=0&k=20&c=dfOZFPv5l5zaGJnWomynI7v2VWeqAREWfo8iRDMkie0="),
                Meal(
                    "Sushi",
                    213214.09,
                    "3",
                    "https://media.istockphoto.com/id/1066110176/es/foto/set-de-sushi-y-rollos-de-maki-california-de-salm%C3%B3n-y-at%C3%BAn-aguacate-cerca-de-palillos-salsa-de.jpg?s=612x612&w=0&k=20&c=Feayes_aOC_720pfzfhK5vb6aoI9zL5MEVuKjQN6pv4="),
                Meal(
                    "Tacos",
                    1221.09,
                    "4",
                    "https://media.istockphoto.com/id/614313140/es/foto/tacos-de-ternera-suave-con-papas-fritas.jpg?s=612x612&w=0&k=20&c=QHiqUDuVqyDokMkE4htKJVRQES_UPq_NGMVP9361TnU="),
                Meal(
                    "Cuscus",
                    8900.09,
                    "5",
                    "https://media.istockphoto.com/id/1219875134/es/foto/tagine-cuscus-con-calamares-y-verduras.jpg?s=612x612&w=0&k=20&c=int0osKW0wr6yHa6zI713ISoPRvI8OBGnbxFQf9X3-c="),
                Meal(
                    "Rice with condiments",
                    6.09,
                    "6",
                    "https://media.istockphoto.com/id/476541008/es/foto/arroz-con-azafr%C3%A1n-con-verduras-y-cilantro.jpg?s=612x612&w=0&k=20&c=BEt70Kspf6AUOuSzC1qGXDfZEjPjsRmrEPevtMirS-4="),
                Meal(
                    "Paella",
                    3232.09,
                    "7",
                    "https://media.istockphoto.com/id/1329666820/es/foto/paella-tradicional-de-mariscos-espa%C3%B1oles-en-la-sart%C3%A9n-sobre-un-fondo-blanco.jpg?s=612x612&w=0&k=20&c=ihLLtcC2Nm6-9QUiZlPqszIjn3kMu7DbNEVuzKbsB20="),
                Meal(
                    "Fish & Chips",
                    4.09,
                    "8",
                    "https://media.istockphoto.com/id/459488805/es/foto/pescado-con-papas-fritas-en-bandeja.jpg?s=612x612&w=0&k=20&c=-ioGpz1b6eq6uk7ZZrKTrCs9NQtv1Iz8415qVF1K08Y="),
                Meal(
                    "Spaghetti amb tomàquet i formatge",
                    2.09,
                    "777777J",
                    "https://media.istockphoto.com/id/1144823591/es/foto/espaguetis-en-un-plato-sobre-un-fondo-blanco.jpg?s=612x612&w=0&k=20&c=85t2f7LimkaEgTQd8P0P1PoINvA0epT8J1es6tf9OIU="),
                Meal(
                    "Mac & Cheese",
                    0.09,
                    "9",
                    "https://media.istockphoto.com/id/667520856/es/foto/macarrones-con-queso-macarrones-y-queso-con-salsa-de-tomate-de-carne-delicioso-almuerzo.jpg?s=612x612&w=0&k=20&c=VfUnfmqOm3schMFUQkAcPvIjWiFbobVpFGCM31LxrIc=")
            )
        }
    }
}