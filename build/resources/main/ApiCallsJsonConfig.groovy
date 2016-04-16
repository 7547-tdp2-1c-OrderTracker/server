/**
 * API CALLS JSON CONFIG
 * contiene mocks de apis para test
 */


/**
 *  Order tracker
 */
 
 '/v1/products' {
	 status = 200
	 error = []
	 json = """{
	"paging": {
		"total": 19,
		"offset": 0,
		"limit": 20
	},
	"results": [{
		"id": 1,
		"name": "Remera Hombre Negra",
		"stock": 32,
		"price": 8910,
		"brand": "Nike",
		"currency": "ARS",
		"thumbnail": "http://www.tenisglobal.com.ar/imagenes/ftp/Indumentaria%20HEAD/Remeras%20Alta%20HEAD/Remera%20HEAD%20Ryan/Remera%20Ryan%20Head%20I.jpg",
		"picture": "http://www.tenisglobal.com.ar/imagenes/ftp/Indumentaria%20HEAD/Remeras%20Alta%20HEAD/Remera%20HEAD%20Ryan/Remera%20Ryan%20Head%20I.jpg"
	}, {
		"id": 2,
		"name": "Remera Hombre Blanca",
		"stock": 32,
		"price": 8910,
		"brand": "Adidas",
		"currency": "ARS",
		"thumbnail": "http://www.tenisglobal.com.ar/imagenes/ftp/Indumentaria%20HEAD/Remeras%20Club%20Branding%20HEAD%20HyM/Remera%20Head%20Branding/Remera%20HEAD%20Branding%20Celeste.jpg",
		"picture": "http://www.tenisglobal.com.ar/imagenes/ftp/Indumentaria%20HEAD/Remeras%20Club%20Branding%20HEAD%20HyM/Remera%20Head%20Branding/Remera%20HEAD%20Branding%20Celeste.jpg"
	}, {
		"id": 3,
		"name": "Remera Hombre Verde",
		"stock": 32,
		"price": 8910,
		"brand": "Nike",
		"currency": "ARS",
		"thumbnail": "http://www.tenisglobal.com.ar/imagenes/ftp/Indumentaria%20HEAD/Remeras%20Alta%20HEAD/Chomba%20HEAD%20Jackson/Chomba%20HEAD%20III.jpg",
		"picture": "http://www.tenisglobal.com.ar/imagenes/ftp/Indumentaria%20HEAD/Remeras%20Alta%20HEAD/Chomba%20HEAD%20Jackson/Chomba%20HEAD%20III.jpg"
	}, {
		"id": 4,
		"name": "Remera Hombre Roja",
		"stock": 32,
		"price": 8910,
		"brand": "Nike",
		"currency": "ARS",
		"thumbnail": "http://www.tenisglobal.com.ar/imagenes/ftp/Indumentaria%20HEAD/Remeras%20Alta%20HEAD/Chomba%20HEAD%20Jackson/Chomba%20HEAD%20I.jpg",
		"picture": "http://www.tenisglobal.com.ar/imagenes/ftp/Indumentaria%20HEAD/Remeras%20Alta%20HEAD/Chomba%20HEAD%20Jackson/Chomba%20HEAD%20I.jpg"
	}, {
		"id": 5,
		"name": "Remera Hombre Amarilla",
		"stock": 32,
		"price": 8910,
		"brand": "Adidas",
		"currency": "ARS",
		"thumbnail": "http://www.modaydeporte.com.ar/wp-content/uploads/2009/01/Nike-Livestrong-Remera-Hombre.jpg",
		"picture": "http://www.modaydeporte.com.ar/wp-content/uploads/2009/01/Nike-Livestrong-Remera-Hombre.jpg"
	}, {
		"id": 6,
		"name": "Remera Mujer Rosa",
		"stock": 32,
		"price": 8910,
		"brand": "Puma",
		"currency": "ARS",
		"thumbnail": "http://mla-d2-p.mlstatic.com/aerobics-pilates-yoga-ropa-deportiva-571101-MLA20269099455_032015-Y.jpg?square=null",
		"picture": "http://mla-d2-p.mlstatic.com/aerobics-pilates-yoga-ropa-deportiva-571101-MLA20269099455_032015-Y.jpg?square=null"
	}, {
		"id": 7,
		"name": "Remera Mujer Negra",
		"stock": 32,
		"price": 8910,
		"brand": "Puma",
		"currency": "ARS",
		"thumbnail": "http://mla-s2-p.mlstatic.com/aerobics-pilates-yoga-ropa-deportiva-238501-MLA20363599848_072015-Y.jpg",
		"picture": "http://mla-s2-p.mlstatic.com/aerobics-pilates-yoga-ropa-deportiva-238501-MLA20363599848_072015-Y.jpg"
	}, {
		"id": 8,
		"name": "Remera Mujer Violeta",
		"stock": 32,
		"price": 8910,
		"brand": "brand 1",
		"currency": "ARS",
		"thumbnail": "http://www.basset.com.ar/db_media/images/producto/215_chica.png",
		"picture": "http://www.basset.com.ar/db_media/images/producto/215_chica.png"
	}, {
		"id": 9,
		"name": "Remera Mujer Roja",
		"stock": 32,
		"price": 8910,
		"brand": "Adidas",
		"currency": "ARS",
		"thumbnail": "http://mla-d2-p.mlstatic.com/indumentaria-tenis-padel-squash-22213-MLA7679972295_012015-Y.jpg?square=null",
		"picture": "http://mla-d2-p.mlstatic.com/indumentaria-tenis-padel-squash-22213-MLA7679972295_012015-Y.jpg?square=null"
	}, {
		"id": 10,
		"name": "Zepatillas Hombre Negra",
		"stock": 32,
		"price": 8910,
		"brand": "Nike",
		"currency": "ARS",
		"thumbnail": "http://eyhombres.com/wp-content/uploads/2013/06/zapatillas-deportivas-hombre1.jpg",
		"picture": "http://eyhombres.com/wp-content/uploads/2013/06/zapatillas-deportivas-hombre1.jpg"
	}, {
		"id": 11,
		"name": "Zepatillas Hombre Azul",
		"stock": 32,
		"price": 8910,
		"brand": "Nike",
		"currency": "ARS",
		"thumbnail": "http://www.zapatos.org/files/2012/04/zapatilla-nike-free-run.jpeg",
		"picture": "http://www.zapatos.org/files/2012/04/zapatilla-nike-free-run.jpeg"
	}, {
		"id": 12,
		"name": "Zepatillas Hombre Verde",
		"stock": 32,
		"price": 8910,
		"brand": "Puma",
		"currency": "ARS",
		"thumbnail": "http://modadeportiva.com.ar/wp-content/uploads/2015/06/Nike-Zapatillas-deportivas-para-hombre-Fingertrap-Max-2015.jpg",
		"picture": "http://modadeportiva.com.ar/wp-content/uploads/2015/06/Nike-Zapatillas-deportivas-para-hombre-Fingertrap-Max-2015.jpg"
	}, {
		"id": 13,
		"name": "Zepatillas Hombre Azul",
		"stock": 32,
		"price": 8910,
		"brand": "Nike",
		"currency": "ARS",
		"thumbnail": "http://i0.wp.com/www.fabricastextiles.com.ar/wp-content/uploads/2015/03/ZAPATILLAS-DEPORTIVAS-HOMBRE.jpg",
		"picture": "http://i0.wp.com/www.fabricastextiles.com.ar/wp-content/uploads/2015/03/ZAPATILLAS-DEPORTIVAS-HOMBRE.jpg"
	}, {
		"id": 14,
		"name": "Zepatillas Mujer Blanca",
		"stock": 32,
		"price": 8910,
		"brand": "Puma",
		"currency": "ARS",
		"thumbnail": "http://mla-s1-p.mlstatic.com/zapatillas-402111-MLA20479312379_112015-Y.jpg",
		"picture": "http://mla-s1-p.mlstatic.com/zapatillas-402111-MLA20479312379_112015-Y.jpg"
	}, {
		"id": 15,
		"name": "Zepatillas Mujer Negra",
		"stock": 32,
		"price": 8910,
		"brand": "Nike",
		"currency": "ARS",
		"thumbnail": "https://www.decathlon.es/media/834/8342041/classic_0ececb5aeda84a7591346cc74c07a02d.jpg",
		"picture": "https://www.decathlon.es/media/834/8342041/classic_0ececb5aeda84a7591346cc74c07a02d.jpg"
	}, {
		"id": 16,
		"name": "Zepatillas Mujer Verde",
		"stock": 32,
		"price": 8910,
		"brand": "Adidas",
		"currency": "ARS",
		"thumbnail": "http://i51.twenga.com/moda/deportivas-mujer/nike-zapatillas-free-og-tp_4266409531051542559f.jpg",
		"picture": "http://i51.twenga.com/moda/deportivas-mujer/nike-zapatillas-free-og-tp_4266409531051542559f.jpg"
	}, {
		"id": 17,
		"name": "Zepatillas Mujer Celeste",
		"stock": 32,
		"price": 8910,
		"brand": "Puma",
		"currency": "ARS",
		"thumbnail": "http://i0.wp.com/www.fabricastextiles.com.ar/wp-content/uploads/2015/03/ZAPATILLAS-DEPORTIVAS-HOMBRE.jpg",
		"picture": "http://i0.wp.com/www.fabricastextiles.com.ar/wp-content/uploads/2015/03/ZAPATILLAS-DEPORTIVAS-HOMBRE.jpg"
	}, {
		"id": 18,
		"name": "Pantalon Mujer Blanca",
		"stock": 32,
		"price": 8910,
		"brand": "Adidas",
		"currency": "ARS",
		"thumbnail": "http://static.kiabi.es/images/pantalon-deportivo-de-felpa-gris-claro-mujer-tn226_1_lpr1.jpg",
		"picture": "http://static.kiabi.es/images/pantalon-deportivo-de-felpa-gris-claro-mujer-tn226_1_lpr1.jpg"
	}, {
		"id": 19,
		"name": "Pantalon Mujer Negra",
		"stock": 32,
		"price": 8910,
		"brand": "Adidas",
		"currency": "ARS",
		"thumbnail": "http://pumaecom.scene7.com/is/image/PUMAECOM/568923_02_PNA?$PUMA_GRID$",
		"picture": "http://pumaecom.scene7.com/is/image/PUMAECOM/568923_02_PNA?$PUMA_GRID$"
	}]
}"""
 }
 
 '/v1/clients' {
	 status = 200
	 error = []
	 json = """{
	"paging": {
		"total": 26,
		"offset": 0,
		"limit": 20
	},
	"results": [{
		"id": 1,
		"name": "Dario",
		"lastname": "Seminara",
		"cuil": "XXXXXXXXX",
		"address": "Evergreen Terrace 777",
		"lon": 32.3,
		"lat": 992.3,
		"email": "darios3@gmail.com",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-128.png"
	}, {
		"id": 2,
		"name": "Matias",
		"lastname": "Piano",
		"cuil": "XXXXXXXXX",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "matias@piano.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-128.png"
	}, {
		"id": 3,
		"name": "Pablo",
		"lastname": "Lucadei",
		"cuil": "ZZZZZZZZZ",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "pablo@mail.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png"
	}, {
		"id": 4,
		"name": "Guido",
		"lastname": "Laghi",
		"cuil": "XXXXXXXXX",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "matias@piano.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client_hat_santa-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client_hat_santa-128.png"
	}, {
		"id": 5,
		"name": "Damian",
		"lastname": "Arias",
		"cuil": "ZZZZZZZZZ",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "pablo@mail.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client_male_person_user_hat-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client_male_person_user_hat-128.png"
	}, {
		"id": 6,
		"name": "Carla",
		"lastname": "Nieves",
		"cuil": "XXXXXXXXX",
		"address": "Evergreen Terrace 777",
		"lon": 32.3,
		"lat": 992.3,
		"email": "darios3@gmail.com",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_account_client_male_person_user_beautiful_girl_woman-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_account_client_male_person_user_beautiful_girl_woman-128.png"
	}, {
		"id": 7,
		"name": "Odalis",
		"lastname": "CirÃ­aco",
		"cuil": "XXXXXXXXX",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "matias@piano.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_account_client_male_person_user_artist_beautiful_girl_woman_celebrity-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_account_client_male_person_user_artist_beautiful_girl_woman_celebrity-128.png"
	}, {
		"id": 8,
		"name": "Laura",
		"lastname": "Gisela",
		"cuil": "ZZZZZZZZZ",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "pablo@mail.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-128.png"
	}, {
		"id": 9,
		"name": "Alexandra",
		"lastname": "Juliana",
		"cuil": "XXXXXXXXX",
		"address": "Evergreen Terrace 777",
		"lon": 32.3,
		"lat": 992.3,
		"email": "darios3@gmail.com",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-128.png"
	}, {
		"id": 10,
		"name": "Marcio",
		"lastname": "Yessenia",
		"cuil": "XXXXXXXXX",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "matias@piano.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_account_client_male_person_user_beautiful_girl_woman_business_female_housewife_1-512.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_account_client_male_person_user_beautiful_girl_woman_business_female_housewife_1-128.png"
	}, {
		"id": 11,
		"name": "Luisina",
		"lastname": "Alcides",
		"cuil": "ZZZZZZZZZ",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "pablo@mail.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png"
	}, {
		"id": 12,
		"name": "Claudia",
		"lastname": "Felicidad",
		"cuil": "XXXXXXXXX",
		"address": "Evergreen Terrace 777",
		"lon": 32.3,
		"lat": 992.3,
		"email": "darios3@gmail.com",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-128.png"
	}, {
		"id": 13,
		"name": "Eduardo",
		"lastname": "ConcepciÃ³n",
		"cuil": "XXXXXXXXX",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "matias@piano.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-128.png"
	}, {
		"id": 14,
		"name": "Heliodoro",
		"lastname": "Basilio",
		"cuil": "ZZZZZZZZZ",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "pablo@mail.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png"
	}, {
		"id": 15,
		"name": "Pascual",
		"lastname": "Haroldo",
		"cuil": "XXXXXXXXX",
		"address": "Evergreen Terrace 777",
		"lon": 32.3,
		"lat": 992.3,
		"email": "darios3@gmail.com",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-128.png"
	}, {
		"id": 16,
		"name": "Horacio",
		"lastname": "Sara",
		"cuil": "XXXXXXXXX",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "matias@piano.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-128.png"
	}, {
		"id": 17,
		"name": "Ernesto",
		"lastname": "Natalia",
		"cuil": "ZZZZZZZZZ",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "pablo@mail.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png"
	}, {
		"id": 18,
		"name": "Ileana",
		"lastname": "VerÃ³nica",
		"cuil": "XXXXXXXXX",
		"address": "Evergreen Terrace 777",
		"lon": 32.3,
		"lat": 992.3,
		"email": "darios3@gmail.com",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_client_male_person_user_work_sport_beard_team_glasses-128.png"
	}, {
		"id": 19,
		"name": "Marino",
		"lastname": "Lupita",
		"cuil": "XXXXXXXXX",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "matias@piano.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_boss_client-128.png"
	}, {
		"id": 20,
		"name": "Rebeca",
		"lastname": "Lorenza",
		"cuil": "ZZZZZZZZZ",
		"address": "Fake Street 123",
		"lon": 31.3,
		"lat": 932.3,
		"email": "pablo@mail.org",
		"phone_number": "1234-5678",
		"avatar": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png",
		"thumbnail": "https://cdn0.iconfinder.com/data/icons/avatars-6/500/Avatar_boy_man_people_account_player-128.png"
	}]
}"""
 }
