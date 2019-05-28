package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utiles.Hora;

class TestFuerte {
	@Test
	void testHoraAddHoraFuerte() {
	    Hora hora;

	    hora = new Hora(20,37,56);
	    hora.addHora(0);
	    assertEquals("20:37:56",hora.getHoraConFormato());

	    hora = new Hora(17,31,30);
	    hora.addHora(6);
	    assertEquals("23:31:30",hora.getHoraConFormato());

	    hora = new Hora(17,20,4);
	    hora.addHora(-18);
	    assertEquals("23:20:04",hora.getHoraConFormato());

	    hora = new Hora(15,15,53);
	    hora.addHora(16);
	    assertEquals("07:15:53",hora.getHoraConFormato());

	    hora = new Hora(11,51,37);
	    hora.addHora(0);
	    assertEquals("11:51:37",hora.getHoraConFormato());

	    hora = new Hora(10,53,27);
	    hora.addHora(20);
	    assertEquals("06:53:27",hora.getHoraConFormato());

	    hora = new Hora(4,48,10);
	    hora.addHora(-3);
	    assertEquals("01:48:10",hora.getHoraConFormato());

	    hora = new Hora(2,3,24);
	    hora.addHora(-3);
	    assertEquals("23:03:24",hora.getHoraConFormato());

	    hora = new Hora(2,50,2);
	    hora.addHora(-4);
	    assertEquals("22:50:02",hora.getHoraConFormato());

	    hora = new Hora(4,53,7);
	    hora.addHora(-23);
	    assertEquals("05:53:07",hora.getHoraConFormato());

	    hora = new Hora(8,18,40);
	    hora.addHora(-22);
	    assertEquals("10:18:40",hora.getHoraConFormato());

	    hora = new Hora(22,47,19);
	    hora.addHora(23);
	    assertEquals("21:47:19",hora.getHoraConFormato());

	    hora = new Hora(2,14,48);
	    hora.addHora(2);
	    assertEquals("04:14:48",hora.getHoraConFormato());

	    hora = new Hora(5,52,15);
	    hora.addHora(-19);
	    assertEquals("10:52:15",hora.getHoraConFormato());

	    hora = new Hora(22,49,44);
	    hora.addHora(3);
	    assertEquals("01:49:44",hora.getHoraConFormato());

	    hora = new Hora(20,52,52);
	    hora.addHora(-10);
	    assertEquals("10:52:52",hora.getHoraConFormato());

	    hora = new Hora(3,42,10);
	    hora.addHora(-19);
	    assertEquals("08:42:10",hora.getHoraConFormato());

	    hora = new Hora(5,43,48);
	    hora.addHora(23);
	    assertEquals("04:43:48",hora.getHoraConFormato());

	    hora = new Hora(2,21,28);
	    hora.addHora(-1);
	    assertEquals("01:21:28",hora.getHoraConFormato());

	    hora = new Hora(22,49,12);
	    hora.addHora(6);
	    assertEquals("04:49:12",hora.getHoraConFormato());

	    hora = new Hora(17,2,42);
	    hora.addHora(-18);
	    assertEquals("23:02:42",hora.getHoraConFormato());

	    hora = new Hora(13,46,4);
	    hora.addHora(-19);
	    assertEquals("18:46:04",hora.getHoraConFormato());

	    hora = new Hora(16,36,36);
	    hora.addHora(-14);
	    assertEquals("02:36:36",hora.getHoraConFormato());

	    hora = new Hora(11,11,52);
	    hora.addHora(6);
	    assertEquals("17:11:52",hora.getHoraConFormato());

	    hora = new Hora(19,40,3);
	    hora.addHora(10);
	    assertEquals("05:40:03",hora.getHoraConFormato());

	    hora = new Hora(1,3,36);
	    hora.addHora(-15);
	    assertEquals("10:03:36",hora.getHoraConFormato());

	    hora = new Hora(5,51,2);
	    hora.addHora(9);
	    assertEquals("14:51:02",hora.getHoraConFormato());

	    hora = new Hora(14,1,25);
	    hora.addHora(7);
	    assertEquals("21:01:25",hora.getHoraConFormato());

	    hora = new Hora(7,57,30);
	    hora.addHora(0);
	    assertEquals("07:57:30",hora.getHoraConFormato());

	    hora = new Hora(11,35,22);
	    hora.addHora(-76);
	    assertEquals("07:35:22",hora.getHoraConFormato());

	    hora = new Hora(8,48,1);
	    hora.addHora(40);
	    assertEquals("00:48:01",hora.getHoraConFormato());

	    hora = new Hora(1,56,51);
	    hora.addHora(-14);
	    assertEquals("11:56:51",hora.getHoraConFormato());

	    hora = new Hora(5,50,1);
	    hora.addHora(-83);
	    assertEquals("18:50:01",hora.getHoraConFormato());

	    hora = new Hora(11,13,4);
	    hora.addHora(44);
	    assertEquals("07:13:04",hora.getHoraConFormato());

	    hora = new Hora(13,57,29);
	    hora.addHora(6);
	    assertEquals("19:57:29",hora.getHoraConFormato());

	    hora = new Hora(20,6,16);
	    hora.addHora(18);
	    assertEquals("14:06:16",hora.getHoraConFormato());

	    hora = new Hora(10,17,15);
	    hora.addHora(-74);
	    assertEquals("08:17:15",hora.getHoraConFormato());

	    hora = new Hora(6,45,22);
	    hora.addHora(31);
	    assertEquals("13:45:22",hora.getHoraConFormato());

	    hora = new Hora(22,7,30);
	    hora.addHora(86);
	    assertEquals("12:07:30",hora.getHoraConFormato());

	    hora = new Hora(18,41,47);
	    hora.addHora(94);
	    assertEquals("16:41:47",hora.getHoraConFormato());

	    hora = new Hora(18,6,31);
	    hora.addHora(42);
	    assertEquals("12:06:31",hora.getHoraConFormato());

	    hora = new Hora(1,18,38);
	    hora.addHora(-82);
	    assertEquals("15:18:38",hora.getHoraConFormato());

	    hora = new Hora(18,13,27);
	    hora.addHora(34);
	    assertEquals("04:13:27",hora.getHoraConFormato());

	    hora = new Hora(20,52,24);
	    hora.addHora(-95);
	    assertEquals("21:52:24",hora.getHoraConFormato());

	    hora = new Hora(19,24,27);
	    hora.addHora(-19);
	    assertEquals("00:24:27",hora.getHoraConFormato());

	    hora = new Hora(8,40,28);
	    hora.addHora(63);
	    assertEquals("23:40:28",hora.getHoraConFormato());

	    hora = new Hora(1,51,13);
	    hora.addHora(38);
	    assertEquals("15:51:13",hora.getHoraConFormato());

	    hora = new Hora(2,21,53);
	    hora.addHora(-72);
	    assertEquals("02:21:53",hora.getHoraConFormato());

	    hora = new Hora(4,48,41);
	    hora.addHora(-73);
	    assertEquals("03:48:41",hora.getHoraConFormato());

	    hora = new Hora(17,29,13);
	    hora.addHora(53);
	    assertEquals("22:29:13",hora.getHoraConFormato());

	    hora = new Hora(14,36,25);
	    hora.addHora(-74);
	    assertEquals("12:36:25",hora.getHoraConFormato());

	    hora = new Hora(22,51,33);
	    hora.addHora(-40);
	    assertEquals("06:51:33",hora.getHoraConFormato());

	    hora = new Hora(13,36,15);
	    hora.addHora(55);
	    assertEquals("20:36:15",hora.getHoraConFormato());

	    hora = new Hora(18,33,29);
	    hora.addHora(-8);
	    assertEquals("10:33:29",hora.getHoraConFormato());

	    hora = new Hora(16,15,40);
	    hora.addHora(5);
	    assertEquals("21:15:40",hora.getHoraConFormato());

	    hora = new Hora(21,7,36);
	    hora.addHora(89);
	    assertEquals("14:07:36",hora.getHoraConFormato());

	    hora = new Hora(5,34,13);
	    hora.addHora(27);
	    assertEquals("08:34:13",hora.getHoraConFormato());

	    hora = new Hora(22,30,30);
	    hora.addHora(29);
	    assertEquals("03:30:30",hora.getHoraConFormato());

	    hora = new Hora(9,12,31);
	    hora.addHora(772);
	    assertEquals("13:12:31",hora.getHoraConFormato());

	    hora = new Hora(6,42,29);
	    hora.addHora(-860);
	    assertEquals("10:42:29",hora.getHoraConFormato());

	    hora = new Hora(18,56,30);
	    hora.addHora(567);
	    assertEquals("09:56:30",hora.getHoraConFormato());

	    hora = new Hora(1,46,38);
	    hora.addHora(572);
	    assertEquals("21:46:38",hora.getHoraConFormato());

	    hora = new Hora(16,38,33);
	    hora.addHora(-984);
	    assertEquals("16:38:33",hora.getHoraConFormato());

	    hora = new Hora(2,30,32);
	    hora.addHora(-220);
	    assertEquals("22:30:32",hora.getHoraConFormato());

	    hora = new Hora(6,2,45);
	    hora.addHora(-292);
	    assertEquals("02:02:45",hora.getHoraConFormato());

	    hora = new Hora(11,47,28);
	    hora.addHora(643);
	    assertEquals("06:47:28",hora.getHoraConFormato());

	    hora = new Hora(15,37,19);
	    hora.addHora(578);
	    assertEquals("17:37:19",hora.getHoraConFormato());

	    hora = new Hora(17,27,15);
	    hora.addHora(796);
	    assertEquals("21:27:15",hora.getHoraConFormato());

	    hora = new Hora(15,20,18);
	    hora.addHora(-962);
	    assertEquals("13:20:18",hora.getHoraConFormato());

	    hora = new Hora(8,28,1);
	    hora.addHora(213);
	    assertEquals("05:28:01",hora.getHoraConFormato());

	    hora = new Hora(13,26,46);
	    hora.addHora(695);
	    assertEquals("12:26:46",hora.getHoraConFormato());

	    hora = new Hora(19,3,39);
	    hora.addHora(296);
	    assertEquals("03:03:39",hora.getHoraConFormato());

	    hora = new Hora(6,9,35);
	    hora.addHora(413);
	    assertEquals("11:09:35",hora.getHoraConFormato());

	    hora = new Hora(21,34,40);
	    hora.addHora(-65);
	    assertEquals("04:34:40",hora.getHoraConFormato());

	    hora = new Hora(13,49,32);
	    hora.addHora(985);
	    assertEquals("14:49:32",hora.getHoraConFormato());

	    hora = new Hora(20,29,5);
	    hora.addHora(-176);
	    assertEquals("12:29:05",hora.getHoraConFormato());

	    hora = new Hora(6,10,9);
	    hora.addHora(726);
	    assertEquals("12:10:09",hora.getHoraConFormato());

	    hora = new Hora(10,39,12);
	    hora.addHora(675);
	    assertEquals("13:39:12",hora.getHoraConFormato());

	    hora = new Hora(3,54,23);
	    hora.addHora(88);
	    assertEquals("19:54:23",hora.getHoraConFormato());

	    hora = new Hora(10,27,1);
	    hora.addHora(653);
	    assertEquals("15:27:01",hora.getHoraConFormato());

	    hora = new Hora(21,23,48);
	    hora.addHora(105);
	    assertEquals("06:23:48",hora.getHoraConFormato());

	    hora = new Hora(9,15,4);
	    hora.addHora(-559);
	    assertEquals("02:15:04",hora.getHoraConFormato());

	    hora = new Hora(3,25,28);
	    hora.addHora(-398);
	    assertEquals("13:25:28",hora.getHoraConFormato());

	    hora = new Hora(20,49,19);
	    hora.addHora(-979);
	    assertEquals("01:49:19",hora.getHoraConFormato());

	    hora = new Hora(8,11,11);
	    hora.addHora(-394);
	    assertEquals("22:11:11",hora.getHoraConFormato());

	    hora = new Hora(1,30,17);
	    hora.addHora(-368);
	    assertEquals("17:30:17",hora.getHoraConFormato());

	    hora = new Hora(17,30,38);
	    hora.addHora(800);
	    assertEquals("01:30:38",hora.getHoraConFormato());

	    hora = new Hora(10,44,27);
	    hora.addMinuto(1);
	    assertEquals("10:45:27",hora.getHoraConFormato());

	    hora = new Hora(19,19,35);
	    hora.addMinuto(22);
	    assertEquals("19:41:35",hora.getHoraConFormato());

	    hora = new Hora(18,39,3);
	    hora.addMinuto(7);
	    assertEquals("18:46:03",hora.getHoraConFormato());

	    hora = new Hora(16,31,16);
	    hora.addMinuto(33);
	    assertEquals("17:04:16",hora.getHoraConFormato());

	    hora = new Hora(13,35,5);
	    hora.addMinuto(21);
	    assertEquals("13:56:05",hora.getHoraConFormato());

	    hora = new Hora(16,28,17);
	    hora.addMinuto(47);
	    assertEquals("17:15:17",hora.getHoraConFormato());

	    hora = new Hora(6,28,18);
	    hora.addMinuto(10);
	    assertEquals("06:38:18",hora.getHoraConFormato());

	    hora = new Hora(2,37,5);
	    hora.addMinuto(54);
	    assertEquals("03:31:05",hora.getHoraConFormato());

	    hora = new Hora(14,57,33);
	    hora.addMinuto(22);
	    assertEquals("15:19:33",hora.getHoraConFormato());

	    hora = new Hora(21,55,34);
	    hora.addMinuto(-15);
	    assertEquals("21:40:34",hora.getHoraConFormato());

	    hora = new Hora(18,25,29);
	    hora.addMinuto(-59);
	    assertEquals("17:26:29",hora.getHoraConFormato());

	    hora = new Hora(21,21,6);
	    hora.addMinuto(-17);
	    assertEquals("21:04:06",hora.getHoraConFormato());

	    hora = new Hora(9,12,43);
	    hora.addMinuto(-16);
	    assertEquals("08:56:43",hora.getHoraConFormato());

	    hora = new Hora(1,27,28);
	    hora.addMinuto(-57);
	    assertEquals("00:30:28",hora.getHoraConFormato());

	    hora = new Hora(5,23,1);
	    hora.addMinuto(37);
	    assertEquals("06:00:01",hora.getHoraConFormato());

	    hora = new Hora(9,12,20);
	    hora.addMinuto(16);
	    assertEquals("09:28:20",hora.getHoraConFormato());

	    hora = new Hora(21,45,31);
	    hora.addMinuto(-38);
	    assertEquals("21:07:31",hora.getHoraConFormato());

	    hora = new Hora(13,46,48);
	    hora.addMinuto(55);
	    assertEquals("14:41:48",hora.getHoraConFormato());

	    hora = new Hora(6,54,8);
	    hora.addMinuto(-24);
	    assertEquals("06:30:08",hora.getHoraConFormato());

	    hora = new Hora(4,22,17);
	    hora.addMinuto(-34);
	    assertEquals("03:48:17",hora.getHoraConFormato());

	    hora = new Hora(21,58,27);
	    hora.addMinuto(-39);
	    assertEquals("21:19:27",hora.getHoraConFormato());

	    hora = new Hora(1,32,25);
	    hora.addMinuto(-14);
	    assertEquals("01:18:25",hora.getHoraConFormato());

	    hora = new Hora(4,31,18);
	    hora.addMinuto(25);
	    assertEquals("04:56:18",hora.getHoraConFormato());

	    hora = new Hora(7,20,10);
	    hora.addMinuto(6);
	    assertEquals("07:26:10",hora.getHoraConFormato());

	    hora = new Hora(1,9,35);
	    hora.addMinuto(23);
	    assertEquals("01:32:35",hora.getHoraConFormato());

	    hora = new Hora(10,24,11);
	    hora.addMinuto(29);
	    assertEquals("10:53:11",hora.getHoraConFormato());

	    hora = new Hora(15,5,23);
	    hora.addMinuto(26);
	    assertEquals("15:31:23",hora.getHoraConFormato());

	    hora = new Hora(7,9,44);
	    hora.addMinuto(-44);
	    assertEquals("06:25:44",hora.getHoraConFormato());

	    hora = new Hora(1,25,10);
	    hora.addMinuto(21);
	    assertEquals("01:46:10",hora.getHoraConFormato());

	    hora = new Hora(2,54,46);
	    hora.addMinuto(407);
	    assertEquals("09:41:46",hora.getHoraConFormato());

	    hora = new Hora(22,36,51);
	    hora.addMinuto(71);
	    assertEquals("23:47:51",hora.getHoraConFormato());

	    hora = new Hora(5,34,50);
	    hora.addMinuto(218);
	    assertEquals("09:12:50",hora.getHoraConFormato());

	    hora = new Hora(11,54,37);
	    hora.addMinuto(-444);
	    assertEquals("04:30:37",hora.getHoraConFormato());

	    hora = new Hora(1,39,11);
	    hora.addMinuto(560);
	    assertEquals("10:59:11",hora.getHoraConFormato());

	    hora = new Hora(22,47,51);
	    hora.addMinuto(-92);
	    assertEquals("21:15:51",hora.getHoraConFormato());

	    hora = new Hora(8,10,13);
	    hora.addMinuto(-257);
	    assertEquals("03:53:13",hora.getHoraConFormato());

	    hora = new Hora(5,34,47);
	    hora.addMinuto(287);
	    assertEquals("10:21:47",hora.getHoraConFormato());

	    hora = new Hora(22,22,38);
	    hora.addMinuto(-119);
	    assertEquals("20:23:38",hora.getHoraConFormato());

	    hora = new Hora(22,57,1);
	    hora.addMinuto(-574);
	    assertEquals("13:23:01",hora.getHoraConFormato());

	    hora = new Hora(4,13,1);
	    hora.addMinuto(-107);
	    assertEquals("02:26:01",hora.getHoraConFormato());

	    hora = new Hora(18,41,29);
	    hora.addMinuto(-164);
	    assertEquals("15:57:29",hora.getHoraConFormato());

	    hora = new Hora(21,27,35);
	    hora.addMinuto(-288);
	    assertEquals("16:39:35",hora.getHoraConFormato());

	    hora = new Hora(8,35,50);
	    hora.addMinuto(-519);
	    assertEquals("23:56:50",hora.getHoraConFormato());

	    hora = new Hora(4,6,11);
	    hora.addMinuto(-440);
	    assertEquals("20:46:11",hora.getHoraConFormato());

	    hora = new Hora(8,3,47);
	    hora.addMinuto(-562);
	    assertEquals("22:41:47",hora.getHoraConFormato());

	    hora = new Hora(18,2,15);
	    hora.addMinuto(-217);
	    assertEquals("14:25:15",hora.getHoraConFormato());

	    hora = new Hora(11,27,18);
	    hora.addMinuto(171);
	    assertEquals("14:18:18",hora.getHoraConFormato());

	    hora = new Hora(22,1,28);
	    hora.addMinuto(298);
	    assertEquals("02:59:28",hora.getHoraConFormato());

	    hora = new Hora(2,32,37);
	    hora.addMinuto(559);
	    assertEquals("11:51:37",hora.getHoraConFormato());

	    hora = new Hora(18,17,9);
	    hora.addMinuto(-370);
	    assertEquals("12:07:09",hora.getHoraConFormato());

	    hora = new Hora(14,7,22);
	    hora.addMinuto(-340);
	    assertEquals("08:27:22",hora.getHoraConFormato());

	    hora = new Hora(3,27,37);
	    hora.addMinuto(-434);
	    assertEquals("20:13:37",hora.getHoraConFormato());

	    hora = new Hora(6,18,3);
	    hora.addMinuto(-78);
	    assertEquals("04:60:03",hora.getHoraConFormato());

	    hora = new Hora(2,56,58);
	    hora.addMinuto(-309);
	    assertEquals("21:47:58",hora.getHoraConFormato());

	    hora = new Hora(2,55,48);
	    hora.addMinuto(-206);
	    assertEquals("23:29:48",hora.getHoraConFormato());

	    hora = new Hora(4,40,40);
	    hora.addMinuto(267);
	    assertEquals("09:07:40",hora.getHoraConFormato());

	    hora = new Hora(19,34,4);
	    hora.addMinuto(555);
	    assertEquals("04:49:04",hora.getHoraConFormato());

	    hora = new Hora(6,55,20);
	    hora.addMinuto(318);
	    assertEquals("12:13:20",hora.getHoraConFormato());

	    hora = new Hora(16,17,10);
	    hora.addMinuto(-4270);
	    assertEquals("17:07:10",hora.getHoraConFormato());

	    hora = new Hora(22,34,50);
	    hora.addMinuto(515);
	    assertEquals("07:09:50",hora.getHoraConFormato());

	    hora = new Hora(10,3,44);
	    hora.addMinuto(-1318);
	    assertEquals("12:05:44",hora.getHoraConFormato());

	    hora = new Hora(13,29,18);
	    hora.addMinuto(3914);
	    assertEquals("06:43:18",hora.getHoraConFormato());

	    hora = new Hora(7,57,17);
	    hora.addMinuto(5246);
	    assertEquals("23:23:17",hora.getHoraConFormato());

	    hora = new Hora(18,4,46);
	    hora.addMinuto(-1181);
	    assertEquals("22:23:46",hora.getHoraConFormato());

	    hora = new Hora(6,9,24);
	    hora.addMinuto(1118);
	    assertEquals("00:47:24",hora.getHoraConFormato());

	    hora = new Hora(14,26,13);
	    hora.addMinuto(-2723);
	    assertEquals("17:03:13",hora.getHoraConFormato());

	    hora = new Hora(11,26,8);
	    hora.addMinuto(-4926);
	    assertEquals("01:20:08",hora.getHoraConFormato());

	    hora = new Hora(13,17,56);
	    hora.addMinuto(-4553);
	    assertEquals("09:24:56",hora.getHoraConFormato());

	    hora = new Hora(11,17,5);
	    hora.addMinuto(2690);
	    assertEquals("08:07:05",hora.getHoraConFormato());

	    hora = new Hora(7,50,36);
	    hora.addMinuto(-2274);
	    assertEquals("17:56:36",hora.getHoraConFormato());

	    hora = new Hora(6,45,48);
	    hora.addMinuto(1131);
	    assertEquals("01:36:48",hora.getHoraConFormato());

	    hora = new Hora(8,17,31);
	    hora.addMinuto(-2404);
	    assertEquals("16:13:31",hora.getHoraConFormato());

	    hora = new Hora(3,21,44);
	    hora.addMinuto(103);
	    assertEquals("05:04:44",hora.getHoraConFormato());

	    hora = new Hora(17,39,27);
	    hora.addMinuto(-2684);
	    assertEquals("20:55:27",hora.getHoraConFormato());

	    hora = new Hora(1,31,17);
	    hora.addMinuto(-4242);
	    assertEquals("02:49:17",hora.getHoraConFormato());

	    hora = new Hora(1,39,48);
	    hora.addMinuto(-4145);
	    assertEquals("04:34:48",hora.getHoraConFormato());

	    hora = new Hora(10,2,25);
	    hora.addMinuto(2018);
	    assertEquals("19:40:25",hora.getHoraConFormato());

	    hora = new Hora(2,30,52);
	    hora.addMinuto(-4372);
	    assertEquals("01:38:52",hora.getHoraConFormato());

	    hora = new Hora(6,53,36);
	    hora.addMinuto(3140);
	    assertEquals("11:13:36",hora.getHoraConFormato());

	    hora = new Hora(5,2,24);
	    hora.addMinuto(2310);
	    assertEquals("19:32:24",hora.getHoraConFormato());

	    hora = new Hora(14,6,40);
	    hora.addMinuto(-5114);
	    assertEquals("00:52:40",hora.getHoraConFormato());

	    hora = new Hora(3,29,11);
	    hora.addMinuto(-2851);
	    assertEquals("03:58:11",hora.getHoraConFormato());

	    hora = new Hora(5,25,21);
	    hora.addMinuto(1507);
	    assertEquals("06:32:21",hora.getHoraConFormato());

	    hora = new Hora(14,4,48);
	    hora.addMinuto(804);
	    assertEquals("03:28:48",hora.getHoraConFormato());

	    hora = new Hora(20,45,37);
	    hora.addMinuto(4807);
	    assertEquals("04:52:37",hora.getHoraConFormato());

	    hora = new Hora(5,15,19);
	    hora.addMinuto(-4568);
	    assertEquals("01:07:19",hora.getHoraConFormato());

	    hora = new Hora(22,35,33);
	    hora.addMinuto(4876);
	    assertEquals("07:51:33",hora.getHoraConFormato());

	    hora = new Hora(13,19,48);
	    hora.addSegundo(-41);
	    assertEquals("13:19:07",hora.getHoraConFormato());

	    hora = new Hora(20,52,33);
	    hora.addSegundo(-18);
	    assertEquals("20:52:15",hora.getHoraConFormato());

	    hora = new Hora(3,22,30);
	    hora.addSegundo(-50);
	    assertEquals("03:21:40",hora.getHoraConFormato());

	    hora = new Hora(15,49,28);
	    hora.addSegundo(0);
	    assertEquals("15:49:28",hora.getHoraConFormato());

	    hora = new Hora(4,51,18);
	    hora.addSegundo(-6);
	    assertEquals("04:51:12",hora.getHoraConFormato());

	    hora = new Hora(21,23,34);
	    hora.addSegundo(30);
	    assertEquals("21:24:04",hora.getHoraConFormato());

	    hora = new Hora(3,12,1);
	    hora.addSegundo(-9);
	    assertEquals("03:11:52",hora.getHoraConFormato());

	    hora = new Hora(18,35,43);
	    hora.addSegundo(14);
	    assertEquals("18:35:57",hora.getHoraConFormato());

	    hora = new Hora(1,23,12);
	    hora.addSegundo(42);
	    assertEquals("01:23:54",hora.getHoraConFormato());

	    hora = new Hora(7,55,52);
	    hora.addSegundo(-58);
	    assertEquals("07:54:54",hora.getHoraConFormato());

	    hora = new Hora(17,39,30);
	    hora.addSegundo(-17);
	    assertEquals("17:39:13",hora.getHoraConFormato());

	    hora = new Hora(9,21,38);
	    hora.addSegundo(-5);
	    assertEquals("09:21:33",hora.getHoraConFormato());

	    hora = new Hora(8,57,36);
	    hora.addSegundo(56);
	    assertEquals("08:58:32",hora.getHoraConFormato());

	    hora = new Hora(2,4,58);
	    hora.addSegundo(-58);
	    assertEquals("02:04:00",hora.getHoraConFormato());

	    hora = new Hora(9,47,57);
	    hora.addSegundo(18);
	    assertEquals("09:48:15",hora.getHoraConFormato());

	    hora = new Hora(16,53,57);
	    hora.addSegundo(8);
	    assertEquals("16:54:05",hora.getHoraConFormato());

	    hora = new Hora(12,48,10);
	    hora.addSegundo(21);
	    assertEquals("12:48:31",hora.getHoraConFormato());

	    hora = new Hora(2,43,30);
	    hora.addSegundo(32);
	    assertEquals("02:44:02",hora.getHoraConFormato());

	    hora = new Hora(9,6,9);
	    hora.addSegundo(29);
	    assertEquals("09:06:38",hora.getHoraConFormato());

	    hora = new Hora(19,37,47);
	    hora.addSegundo(-7);
	    assertEquals("19:37:40",hora.getHoraConFormato());

	    hora = new Hora(6,53,37);
	    hora.addSegundo(59);
	    assertEquals("06:54:36",hora.getHoraConFormato());

	    hora = new Hora(17,53,20);
	    hora.addSegundo(16);
	    assertEquals("17:53:36",hora.getHoraConFormato());

	    hora = new Hora(12,39,33);
	    hora.addSegundo(26);
	    assertEquals("12:39:59",hora.getHoraConFormato());

	    hora = new Hora(22,56,19);
	    hora.addSegundo(-17);
	    assertEquals("22:56:02",hora.getHoraConFormato());

	    hora = new Hora(16,44,27);
	    hora.addSegundo(-17);
	    assertEquals("16:44:10",hora.getHoraConFormato());

	    hora = new Hora(5,34,45);
	    hora.addSegundo(20);
	    assertEquals("05:35:05",hora.getHoraConFormato());

	    hora = new Hora(10,14,33);
	    hora.addSegundo(-26);
	    assertEquals("10:14:07",hora.getHoraConFormato());

	    hora = new Hora(19,41,49);
	    hora.addSegundo(14);
	    assertEquals("19:42:03",hora.getHoraConFormato());

	    hora = new Hora(4,43,24);
	    hora.addSegundo(-1);
	    assertEquals("04:43:23",hora.getHoraConFormato());

	    hora = new Hora(3,16,6);
	    hora.addSegundo(242);
	    assertEquals("03:20:08",hora.getHoraConFormato());

	    hora = new Hora(18,8,16);
	    hora.addSegundo(63);
	    assertEquals("18:09:19",hora.getHoraConFormato());

	    hora = new Hora(19,42,53);
	    hora.addSegundo(191);
	    assertEquals("19:46:04",hora.getHoraConFormato());

	    hora = new Hora(19,6,57);
	    hora.addSegundo(471);
	    assertEquals("19:14:48",hora.getHoraConFormato());

	    hora = new Hora(22,1,2);
	    hora.addSegundo(-176);
	    assertEquals("21:58:06",hora.getHoraConFormato());

	    hora = new Hora(6,45,31);
	    hora.addSegundo(170);
	    assertEquals("06:48:21",hora.getHoraConFormato());

	    hora = new Hora(10,3,49);
	    hora.addSegundo(144);
	    assertEquals("10:06:13",hora.getHoraConFormato());

	    hora = new Hora(11,49,55);
	    hora.addSegundo(499);
	    assertEquals("11:58:14",hora.getHoraConFormato());

	    hora = new Hora(4,7,53);
	    hora.addSegundo(-267);
	    assertEquals("04:03:26",hora.getHoraConFormato());

	    hora = new Hora(9,26,36);
	    hora.addSegundo(-406);
	    assertEquals("09:19:50",hora.getHoraConFormato());

	    hora = new Hora(17,15,28);
	    hora.addSegundo(68);
	    assertEquals("17:16:36",hora.getHoraConFormato());

	    hora = new Hora(21,48,21);
	    hora.addSegundo(311);
	    assertEquals("21:53:32",hora.getHoraConFormato());

	    hora = new Hora(6,14,9);
	    hora.addSegundo(-490);
	    assertEquals("06:05:59",hora.getHoraConFormato());

	    hora = new Hora(6,3,58);
	    hora.addSegundo(-282);
	    assertEquals("05:59:16",hora.getHoraConFormato());

	    hora = new Hora(15,49,17);
	    hora.addSegundo(399);
	    assertEquals("15:55:56",hora.getHoraConFormato());

	    hora = new Hora(7,37,58);
	    hora.addSegundo(-558);
	    assertEquals("07:28:40",hora.getHoraConFormato());

	    hora = new Hora(12,10,19);
	    hora.addSegundo(223);
	    assertEquals("12:14:02",hora.getHoraConFormato());

	    hora = new Hora(7,8,15);
	    hora.addSegundo(552);
	    assertEquals("07:17:27",hora.getHoraConFormato());

	    hora = new Hora(13,28,46);
	    hora.addSegundo(238);
	    assertEquals("13:32:44",hora.getHoraConFormato());

	    hora = new Hora(12,46,41);
	    hora.addSegundo(-523);
	    assertEquals("12:37:58",hora.getHoraConFormato());

	    hora = new Hora(20,46,45);
	    hora.addSegundo(-209);
	    assertEquals("20:43:16",hora.getHoraConFormato());

	    hora = new Hora(12,14,14);
	    hora.addSegundo(80);
	    assertEquals("12:15:34",hora.getHoraConFormato());

	    hora = new Hora(10,22,8);
	    hora.addSegundo(138);
	    assertEquals("10:24:26",hora.getHoraConFormato());

	    hora = new Hora(3,1,12);
	    hora.addSegundo(388);
	    assertEquals("03:07:40",hora.getHoraConFormato());

	    hora = new Hora(22,10,11);
	    hora.addSegundo(18);
	    assertEquals("22:10:29",hora.getHoraConFormato());

	    hora = new Hora(11,13,50);
	    hora.addSegundo(528);
	    assertEquals("11:22:38",hora.getHoraConFormato());

	    hora = new Hora(7,1,25);
	    hora.addSegundo(343);
	    assertEquals("07:07:08",hora.getHoraConFormato());

	    hora = new Hora(15,52,30);
	    hora.addSegundo(157);
	    assertEquals("15:55:07",hora.getHoraConFormato());

	    hora = new Hora(10,9,28);
	    hora.addSegundo(-218);
	    assertEquals("10:05:50",hora.getHoraConFormato());

	    hora = new Hora(22,48,46);
	    hora.addSegundo(-2140);
	    assertEquals("22:13:06",hora.getHoraConFormato());

	    hora = new Hora(17,46,3);
	    hora.addSegundo(4834);
	    assertEquals("19:06:37",hora.getHoraConFormato());

	    hora = new Hora(14,6,27);
	    hora.addSegundo(-4941);
	    assertEquals("12:44:06",hora.getHoraConFormato());

	    hora = new Hora(11,38,43);
	    hora.addSegundo(-2853);
	    assertEquals("10:51:10",hora.getHoraConFormato());

	    hora = new Hora(1,44,14);
	    hora.addSegundo(-1640);
	    assertEquals("01:16:54",hora.getHoraConFormato());

	    hora = new Hora(15,39,55);
	    hora.addSegundo(-5271);
	    assertEquals("14:12:04",hora.getHoraConFormato());

	    hora = new Hora(1,22,6);
	    hora.addSegundo(-5659);
	    assertEquals("23:47:47",hora.getHoraConFormato());

	    hora = new Hora(18,57,23);
	    hora.addSegundo(583);
	    assertEquals("19:07:06",hora.getHoraConFormato());

	    hora = new Hora(13,29,14);
	    hora.addSegundo(-2792);
	    assertEquals("12:42:42",hora.getHoraConFormato());

	    hora = new Hora(18,32,54);
	    hora.addSegundo(-614);
	    assertEquals("18:22:40",hora.getHoraConFormato());

	    hora = new Hora(15,30,50);
	    hora.addSegundo(-5302);
	    assertEquals("14:02:28",hora.getHoraConFormato());

	    hora = new Hora(7,41,7);
	    hora.addSegundo(5711);
	    assertEquals("09:16:18",hora.getHoraConFormato());

	    hora = new Hora(8,21,40);
	    hora.addSegundo(3215);
	    assertEquals("09:15:15",hora.getHoraConFormato());

	    hora = new Hora(12,45,5);
	    hora.addSegundo(1343);
	    assertEquals("13:07:28",hora.getHoraConFormato());

	    hora = new Hora(15,20,41);
	    hora.addSegundo(-257);
	    assertEquals("15:16:24",hora.getHoraConFormato());

	    hora = new Hora(15,8,28);
	    hora.addSegundo(-2420);
	    assertEquals("14:28:08",hora.getHoraConFormato());

	    hora = new Hora(14,42,39);
	    hora.addSegundo(4114);
	    assertEquals("15:51:13",hora.getHoraConFormato());

	    hora = new Hora(8,10,45);
	    hora.addSegundo(3375);
	    assertEquals("09:07:00",hora.getHoraConFormato());

	    hora = new Hora(15,31,47);
	    hora.addSegundo(635);
	    assertEquals("15:42:22",hora.getHoraConFormato());

	    hora = new Hora(13,25,56);
	    hora.addSegundo(237);
	    assertEquals("13:29:53",hora.getHoraConFormato());

	    hora = new Hora(2,39,39);
	    hora.addSegundo(5834);
	    assertEquals("04:16:53",hora.getHoraConFormato());

	    hora = new Hora(18,19,55);
	    hora.addSegundo(-1948);
	    assertEquals("17:47:27",hora.getHoraConFormato());

	    hora = new Hora(7,13,17);
	    hora.addSegundo(-5197);
	    assertEquals("05:46:40",hora.getHoraConFormato());

	    hora = new Hora(12,53,44);
	    hora.addSegundo(2424);
	    assertEquals("13:34:08",hora.getHoraConFormato());

	    hora = new Hora(6,19,12);
	    hora.addSegundo(4343);
	    assertEquals("07:31:35",hora.getHoraConFormato());

	    hora = new Hora(13,18,33);
	    hora.addSegundo(1198);
	    assertEquals("13:38:31",hora.getHoraConFormato());

	    hora = new Hora(7,19,4);
	    hora.addSegundo(1643);
	    assertEquals("07:46:27",hora.getHoraConFormato());

	    hora = new Hora(1,54,55);
	    hora.addSegundo(-4748);
	    assertEquals("00:35:47",hora.getHoraConFormato());

	    hora = new Hora(1,29,19);
	    hora.addSegundo(4376);
	    assertEquals("02:42:15",hora.getHoraConFormato());

	}
}
