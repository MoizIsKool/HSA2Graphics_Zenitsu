/*
    Zenitsu.java
    Moiz Ahmad
    2023/12/15
    Basic graphic design program that creates a character using the hsa2 library
    Different colours, shapes, and lines/sizes are used
 */

import hsa2.GraphicsConsole;
import java.awt.*; // Importing EVERYTHING from the awt library (Including POLYGON and COLOR)!

public class Zenitsu {

    final int WIDTH = 900;
    final int HEIGHT = 600;

    GraphicsConsole gc = new GraphicsConsole(WIDTH, HEIGHT);

    public static void main(String[] args) {

        new Zenitsu();

    }

    Zenitsu() {
        gc.setAntiAlias(true);
        gc.setTitle("Zenitsu Awakens");
        gc.setLocationRelativeTo(null);
        gc.setBackgroundColor(new Color(119, 41, 18));
        gc.clear();

        //FLOOR + DESIGN

        //POLYGONS
        Polygon bottomLeftCorner = new Polygon();
        bottomLeftCorner.addPoint(0, 530);
        bottomLeftCorner.addPoint(155, 530);
        bottomLeftCorner.addPoint(60, 600);
        bottomLeftCorner.addPoint(0, 600);

        Polygon floorDarkOutline = new Polygon();
        floorDarkOutline.addPoint(155, 530);
        floorDarkOutline.addPoint(60, 600);
        floorDarkOutline.addPoint(95, 600);
        floorDarkOutline.addPoint(165, 550);
        floorDarkOutline.addPoint(455, 550);
        floorDarkOutline.addPoint(510, 600);
        floorDarkOutline.addPoint(560, 600);
        floorDarkOutline.addPoint(500, 550);
        floorDarkOutline.addPoint(750, 550);
        floorDarkOutline.addPoint(900, 575);
        floorDarkOutline.addPoint(900, 565);
        floorDarkOutline.addPoint(735, 525);
        floorDarkOutline.addPoint(710, 525);
        floorDarkOutline.addPoint(755, 540);
        floorDarkOutline.addPoint(155, 540);
        floorDarkOutline.addPoint(170, 530);

        Polygon bottomRightCorner = new Polygon();
        bottomRightCorner.addPoint(735, 525);
        bottomRightCorner.addPoint(900, 525);
        bottomRightCorner.addPoint(900, 565);

        // DRAWING
        gc.setColor(new Color(164, 63, 18));
        gc.fillRect(0, 520, 900, 80);

        gc.setColor(new Color(45, 9, 1));
        gc.fillRect(0, 525, 900, 5);
        gc.fillPolygon(floorDarkOutline);

        // LINES
        gc.setColor(new Color(45, 9, 1));
        int x1 = 0, y1 = 520, x2 = -300, y2 = 600;
        int x1Increment = 8, x2Increment = 15;

        while (true) {

            if (x1 >= 820) {
                break;
            }

            gc.drawLine(x1, y1, x2, y2);
            x1 += x1Increment;
            x2 += x2Increment;

        }

        // MORE DRAWING

        gc.setColor(new Color(164, 63, 18).darker());
        gc.fillRect(0, 520, 900, 5);
        gc.fillPolygon(bottomLeftCorner);

        // ALL WOODEN BARS + DOOR + OUTLINES

        //POLYGONS
        Polygon doorBar = new Polygon();
        doorBar.addPoint(800, 60);
        doorBar.addPoint(900, 15);
        doorBar.addPoint(900, 45);
        doorBar.addPoint(820, 80);
        doorBar.addPoint(820, 520);
        doorBar.addPoint(800, 520);

        Polygon topRightCorner = new Polygon();
        topRightCorner.addPoint(800, 60);
        topRightCorner.addPoint(800, 0);
        topRightCorner.addPoint(900, 0);
        topRightCorner.addPoint(900, 15);

        Polygon doorOutline = new Polygon();

        doorOutline.addPoint(820, 80);
        doorOutline.addPoint(900, 45);
        doorOutline.addPoint(900, 60);
        doorOutline.addPoint(824, 89);
        doorOutline.addPoint(824, 509);
        doorOutline.addPoint(900, 515);
        doorOutline.addPoint(900, 525);
        doorOutline.addPoint(820, 520);

        //DRAWING

        gc.setColor(new Color(71, 21, 6));
        gc.fillPolygon(doorBar);

        gc.setColor(new Color(100, 30, 8));
        gc.fillPolygon(topRightCorner);

        gc.setColor(new Color(45, 9, 1));
        gc.fillPolygon(doorOutline);
        gc.fillOval(825, 310, 10, 15);

        gc.setColor(new Color(87, 24, 6));
        gc.fillRect(0, 60, 165, 20);
        gc.fillRect(0, 500, 165, 20);
        gc.fillRect(165, 0, 20, 520);
        gc.fillRect(185, 60, 615, 20);
        gc.fillRect(185, 500, 615, 20);
        gc.fillRect(800, 0, 5, 60);


        //////////////////////////////////


        // ZENITSU (CHARACTER)
        gc.setStroke(2);

        //SHOES

        // POLYGONS
        Polygon leftFootOutline = new Polygon();
        leftFootOutline.addPoint(325, 562);
        leftFootOutline.addPoint(322, 555);
        leftFootOutline.addPoint(357, 536);
        leftFootOutline.addPoint(390, 530);
        leftFootOutline.addPoint(411, 533);
        leftFootOutline.addPoint(423, 543);
        leftFootOutline.addPoint(424, 563);

        Polygon leftFootWhite1 = new Polygon();
        leftFootWhite1.addPoint(325, 562);
        leftFootWhite1.addPoint(422, 562);
        leftFootWhite1.addPoint(422, 568);
        leftFootWhite1.addPoint(328, 570);

        Polygon leftFootWhite2 = new Polygon();
        leftFootWhite2.addPoint(412, 534);
        leftFootWhite2.addPoint(419, 534);
        leftFootWhite2.addPoint(418, 544);
        leftFootWhite2.addPoint(398, 563);
        leftFootWhite2.addPoint(396, 557);

        Polygon leftFootWhite3 = new Polygon();
        leftFootWhite3.addPoint(353, 549);
        leftFootWhite3.addPoint(361, 544);
        leftFootWhite3.addPoint(381, 544);
        leftFootWhite3.addPoint(392, 555);
        leftFootWhite3.addPoint(392, 561);
        leftFootWhite3.addPoint(379, 563);
        leftFootWhite3.addPoint(368, 552);

        Polygon leftFootWhite4 = new Polygon();
        leftFootWhite4.addPoint(351, 539);
        leftFootWhite4.addPoint(356, 538);
        leftFootWhite4.addPoint(350, 548);
        leftFootWhite4.addPoint(345, 549);


        Polygon rightFootOutline = new Polygon();
        rightFootOutline.addPoint(770, 481);
        rightFootOutline.addPoint(782, 483);
        rightFootOutline.addPoint(794, 496);
        rightFootOutline.addPoint(793, 503);
        rightFootOutline.addPoint(778, 531);
        rightFootOutline.addPoint(775, 561);
        rightFootOutline.addPoint(765, 570);
        rightFootOutline.addPoint(710, 570);
        rightFootOutline.addPoint(709, 565);
        rightFootOutline.addPoint(708, 557);
        rightFootOutline.addPoint(722, 549);
        rightFootOutline.addPoint(723, 542);
        rightFootOutline.addPoint(740, 528);
        rightFootOutline.addPoint(747, 508);

        Polygon rightFootWhite1 = new Polygon();
        rightFootWhite1.addPoint(788, 491);
        rightFootWhite1.addPoint(795, 493);
        rightFootWhite1.addPoint(796, 502);
        rightFootWhite1.addPoint(779, 529);
        rightFootWhite1.addPoint(775, 561);
        rightFootWhite1.addPoint(766, 571);
        rightFootWhite1.addPoint(709, 573);
        rightFootWhite1.addPoint(708, 565);
        rightFootWhite1.addPoint(754, 565);
        rightFootWhite1.addPoint(768, 560);
        rightFootWhite1.addPoint(768, 540);
        rightFootWhite1.addPoint(772, 536);
        rightFootWhite1.addPoint(775, 519);
        rightFootWhite1.addPoint(785, 506);

        Polygon rightFootWhite2 = new Polygon();
        rightFootWhite2.addPoint(769, 484);
        rightFootWhite2.addPoint(773, 503);
        rightFootWhite2.addPoint(772, 530);
        rightFootWhite2.addPoint(766, 527);
        rightFootWhite2.addPoint(761, 493);

        Polygon rightFootWhite3 = new Polygon();
        rightFootWhite3.addPoint(752, 535);
        rightFootWhite3.addPoint(762, 535);
        rightFootWhite3.addPoint(768, 541);
        rightFootWhite3.addPoint(736, 548);

        Polygon rightFootWhite4 = new Polygon();
        rightFootWhite4.addPoint(731, 540);
        rightFootWhite4.addPoint(735, 550);
        rightFootWhite4.addPoint(724, 553);
        rightFootWhite4.addPoint(724, 544);

        //DRAWINGS

        gc.setColor(new Color(100, 26, 14));
        gc.fillPolygon(leftFootOutline);
        gc.fillPolygon(rightFootOutline);


        gc.setColor(Color.BLACK);

        gc.setStroke(1);
        gc.drawPolygon(leftFootOutline);
        gc.drawPolygon(rightFootOutline);

        gc.setStroke(2);
        gc.drawPolygon(leftFootWhite1);
        gc.drawPolygon(leftFootWhite2);
        gc.drawPolygon(leftFootWhite3);
        gc.drawPolygon(leftFootWhite4);
        gc.drawOval(765, 530, 5, 6);
        gc.drawPolygon(rightFootWhite1);
        gc.drawPolygon(rightFootWhite2);
        gc.drawPolygon(rightFootWhite3);
        gc.drawPolygon(rightFootWhite4);

        //FILL
        gc.setColor(new Color(228, 174, 154));
        gc.fillOval(392, 558, 6, 6);
        gc.fillPolygon(leftFootWhite1);
        gc.fillPolygon(leftFootWhite2);
        gc.fillPolygon(leftFootWhite3);
        gc.fillPolygon(leftFootWhite4);

        gc.fillOval(765, 530, 7, 7);
        gc.fillPolygon(rightFootWhite1);
        gc.fillPolygon(rightFootWhite2);
        gc.fillPolygon(rightFootWhite3);
        gc.fillPolygon(rightFootWhite4);


        //ANKLES

        //POLYGONS

        Polygon rightAnkleOutline = new Polygon();
        rightAnkleOutline.addPoint(685, 402);
        rightAnkleOutline.addPoint(710, 408);
        rightAnkleOutline.addPoint(730, 445);
        rightAnkleOutline.addPoint(753, 449);
        rightAnkleOutline.addPoint(766, 466);
        rightAnkleOutline.addPoint(770, 480);
        rightAnkleOutline.addPoint(746, 509);
        rightAnkleOutline.addPoint(742, 514);
        rightAnkleOutline.addPoint(712, 509);
        rightAnkleOutline.addPoint(698, 488);
        rightAnkleOutline.addPoint(668, 485);
        rightAnkleOutline.addPoint(650, 474);
        rightAnkleOutline.addPoint(660, 462);
        rightAnkleOutline.addPoint(667, 439);
        rightAnkleOutline.addPoint(682, 424);

        Polygon rightAnkleBrown1 = new Polygon();
        rightAnkleBrown1.addPoint(726, 481);
        rightAnkleBrown1.addPoint(728, 505);
        rightAnkleBrown1.addPoint(706, 490);
        rightAnkleBrown1.addPoint(704, 484);

        Polygon rightAnkleBrown2 = new Polygon();
        rightAnkleBrown2.addPoint(693, 466);
        rightAnkleBrown2.addPoint(696, 478);
        rightAnkleBrown2.addPoint(655, 477);

        Polygon rightAnkleWhite1 = new Polygon();
        rightAnkleWhite1.addPoint(736, 500);
        rightAnkleWhite1.addPoint(742, 507);
        rightAnkleWhite1.addPoint(732, 511);
        rightAnkleWhite1.addPoint(729, 520);
        rightAnkleWhite1.addPoint(719, 513);
        rightAnkleWhite1.addPoint(729, 509);

        Polygon rightAnkleWhite2 = new Polygon();
        rightAnkleWhite2.addPoint(736, 486);
        rightAnkleWhite2.addPoint(748, 487);
        rightAnkleWhite2.addPoint(743, 500);

        Polygon rightAnkleWhite3 = new Polygon();
        rightAnkleWhite3.addPoint(754, 460);
        rightAnkleWhite3.addPoint(763, 468);
        rightAnkleWhite3.addPoint(757, 477);

        Polygon rightAnkleWhite4 = new Polygon();
        rightAnkleWhite4.addPoint(728, 459);
        rightAnkleWhite4.addPoint(742, 464);
        rightAnkleWhite4.addPoint(734, 476);

        Polygon rightAnkleWhite5 = new Polygon();
        rightAnkleWhite5.addPoint(696, 450);
        rightAnkleWhite5.addPoint(702, 464);
        rightAnkleWhite5.addPoint(707, 453);

        Polygon rightAnkleWhite6 = new Polygon();
        rightAnkleWhite6.addPoint(702, 472);
        rightAnkleWhite6.addPoint(707, 480);
        rightAnkleWhite6.addPoint(698, 483);
        rightAnkleWhite6.addPoint(697, 491);
        rightAnkleWhite6.addPoint(690, 482);
        rightAnkleWhite6.addPoint(697, 480);

        Polygon rightAnkleWhite7 = new Polygon();
        rightAnkleWhite7.addPoint(681, 451);
        rightAnkleWhite7.addPoint(674, 466);
        rightAnkleWhite7.addPoint(667, 452);

        Polygon rightAnkleWhite8 = new Polygon();
        rightAnkleWhite8.addPoint(658, 461);
        rightAnkleWhite8.addPoint(667, 471);
        rightAnkleWhite8.addPoint(653, 475);
        rightAnkleWhite8.addPoint(656, 484);
        rightAnkleWhite8.addPoint(646, 479);
        rightAnkleWhite8.addPoint(651, 473);

        Polygon rightAnkleWhite9 = new Polygon();
        rightAnkleWhite9.addPoint(697, 422);
        rightAnkleWhite9.addPoint(690, 438);
        rightAnkleWhite9.addPoint(684, 426);

        Polygon rightAnkleWhite10 = new Polygon();
        rightAnkleWhite10.addPoint(705, 420);
        rightAnkleWhite10.addPoint(716, 423);
        rightAnkleWhite10.addPoint(714, 433);


        Polygon leftAnkleOutline = new Polygon();
        leftAnkleOutline.addPoint(395, 460);
        leftAnkleOutline.addPoint(410, 472);
        leftAnkleOutline.addPoint(412, 506);
        leftAnkleOutline.addPoint(425, 517);
        leftAnkleOutline.addPoint(420, 534);
        leftAnkleOutline.addPoint(390, 532);
        leftAnkleOutline.addPoint(377, 536);
        leftAnkleOutline.addPoint(357, 536);
        leftAnkleOutline.addPoint(357, 518);
        leftAnkleOutline.addPoint(350, 511);
        leftAnkleOutline.addPoint(339, 510);
        leftAnkleOutline.addPoint(331, 501);
        leftAnkleOutline.addPoint(369, 467);
        leftAnkleOutline.addPoint(386, 467);

        Polygon leftAnkleBrown1 = new Polygon();
        leftAnkleBrown1.addPoint(366, 517);
        leftAnkleBrown1.addPoint(378, 524);
        leftAnkleBrown1.addPoint(368, 531);
        leftAnkleBrown1.addPoint(361, 527);

        Polygon leftAnkleBrown2 = new Polygon();
        leftAnkleBrown2.addPoint(359, 493);
        leftAnkleBrown2.addPoint(355, 508);
        leftAnkleBrown2.addPoint(340, 502);
        leftAnkleBrown2.addPoint(342, 495);

        Polygon leftAnkleWhite1 = new Polygon();
        leftAnkleWhite1.addPoint(375, 530);
        leftAnkleWhite1.addPoint(376, 538);
        leftAnkleWhite1.addPoint(367, 534);
        leftAnkleWhite1.addPoint(358, 536);
        leftAnkleWhite1.addPoint(357, 529);
        leftAnkleWhite1.addPoint(367, 532);

        Polygon leftAnkleWhite2 = new Polygon();
        leftAnkleWhite2.addPoint(401, 507);
        leftAnkleWhite2.addPoint(396, 519);
        leftAnkleWhite2.addPoint(409, 519);

        Polygon leftAnkleWhite3 = new Polygon();
        leftAnkleWhite3.addPoint(399, 470);
        leftAnkleWhite3.addPoint(409, 479);
        leftAnkleWhite3.addPoint(400, 486);

        Polygon leftAnkleWhite4 = new Polygon();
        leftAnkleWhite4.addPoint(376, 488);
        leftAnkleWhite4.addPoint(388, 496);
        leftAnkleWhite4.addPoint(376, 502);

        Polygon leftAnkleWhite5 = new Polygon();
        leftAnkleWhite5.addPoint(364, 498);
        leftAnkleWhite5.addPoint(372, 507);
        leftAnkleWhite5.addPoint(361, 511);
        leftAnkleWhite5.addPoint(358, 519);
        leftAnkleWhite5.addPoint(351, 510);
        leftAnkleWhite5.addPoint(358, 508);

        Polygon leftAnkleWhite6 = new Polygon();
        leftAnkleWhite6.addPoint(386, 467);
        leftAnkleWhite6.addPoint(389, 471);
        leftAnkleWhite6.addPoint(376, 479);
        leftAnkleWhite6.addPoint(376, 467);

        Polygon leftAnkleWhite7 = new Polygon();
        leftAnkleWhite7.addPoint(349, 486);
        leftAnkleWhite7.addPoint(352, 493);
        leftAnkleWhite7.addPoint(342, 494);

        Polygon leftAnkleWhite8 = new Polygon();
        leftAnkleWhite8.addPoint(340, 502);
        leftAnkleWhite8.addPoint(354, 508);
        leftAnkleWhite8.addPoint(340, 509);
        leftAnkleWhite8.addPoint(332, 500);
        leftAnkleWhite8.addPoint(340, 498);

        //DRAWINGS
        gc.setColor(new Color(252, 115, 4));
        gc.fillPolygon(rightAnkleOutline);
        gc.fillPolygon(leftAnkleOutline);

        gc.setColor(Color.BLACK);

        //DRAW
        gc.setStroke(1);
        gc.drawPolygon(rightAnkleOutline);
        gc.drawPolygon(leftAnkleOutline);

        gc.setStroke(2);
        gc.drawPolygon(rightAnkleBrown1);
        gc.drawPolygon(rightAnkleBrown2);
        gc.drawPolygon(rightAnkleWhite1);
        gc.drawPolygon(rightAnkleWhite2);
        gc.drawPolygon(rightAnkleWhite3);
        gc.drawPolygon(rightAnkleWhite4);
        gc.drawPolygon(rightAnkleWhite5);
        gc.drawPolygon(rightAnkleWhite6);
        gc.drawPolygon(rightAnkleWhite7);
        gc.drawPolygon(rightAnkleWhite8);
        gc.drawPolygon(rightAnkleWhite9);
        gc.drawPolygon(rightAnkleWhite10);

        gc.drawPolygon(leftAnkleBrown1);
        gc.drawPolygon(leftAnkleBrown2);
        gc.drawPolygon(leftAnkleWhite1);
        gc.drawPolygon(leftAnkleWhite2);
        gc.drawPolygon(leftAnkleWhite3);
        gc.drawPolygon(leftAnkleWhite4);
        gc.drawPolygon(leftAnkleWhite5);
        gc.drawPolygon(leftAnkleWhite6);
        gc.drawPolygon(leftAnkleWhite7);
        gc.drawPolygon(leftAnkleWhite8);


        gc.setColor(new Color(255, 239, 236));
        //FILL WHITE
        gc.fillPolygon(rightAnkleWhite1);
        gc.fillPolygon(rightAnkleWhite2);
        gc.fillPolygon(rightAnkleWhite3);
        gc.fillPolygon(rightAnkleWhite4);
        gc.fillPolygon(rightAnkleWhite5);
        gc.fillPolygon(rightAnkleWhite6);
        gc.fillPolygon(rightAnkleWhite7);
        gc.fillPolygon(rightAnkleWhite8);
        gc.fillPolygon(rightAnkleWhite9);
        gc.fillPolygon(rightAnkleWhite10);

        gc.fillPolygon(leftAnkleBrown1);
        gc.fillPolygon(leftAnkleBrown2);
        gc.fillPolygon(leftAnkleWhite1);
        gc.fillPolygon(leftAnkleWhite2);
        gc.fillPolygon(leftAnkleWhite3);
        gc.fillPolygon(leftAnkleWhite4);
        gc.fillPolygon(leftAnkleWhite5);
        gc.fillPolygon(leftAnkleWhite6);
        gc.fillPolygon(leftAnkleWhite7);
        gc.fillPolygon(leftAnkleWhite8);


        gc.setColor(new Color(110, 27, 14));
        //FILL WHITE
        gc.fillPolygon(rightAnkleBrown1);
        gc.fillPolygon(rightAnkleBrown2);

        gc.fillPolygon(leftAnkleBrown1);
        gc.fillPolygon(leftAnkleBrown2);


        // HAIR BACK LAYER
        //THIS IS BEING DONE EARLY TO HIDE LONG LINES, AND MAKE IT LOOK LIKE ITS IN THE BACK!!

        Polygon backHair = new Polygon();
        backHair.addPoint(219, 369);
        backHair.addPoint(235, 347);
        backHair.addPoint(229, 340);
        backHair.addPoint(203, 351);

        gc.setColor(new Color(242, 101, 22));
        gc.fillPolygon(backHair);
        gc.setColor(Color.BLACK);
        gc.setStroke(1);
        gc.drawPolygon(backHair);

        gc.setStroke(1);
        gc.setColor(Color.BLACK);
        gc.drawLine(211, 348, 225, 362);
        gc.drawLine(221, 344, 230, 354);
        gc.drawLine(228, 339, 235, 347);


        // MAIN BODY (SHIRT/ONESIE THING)

        // POLYGONS

        Polygon mainBodyShirt = new Polygon();
        mainBodyShirt.addPoint(486, 199);
        mainBodyShirt.addPoint(482, 264);
        mainBodyShirt.addPoint(507, 252);
        mainBodyShirt.addPoint(515, 254);
        mainBodyShirt.addPoint(523, 264);
        mainBodyShirt.addPoint(539, 270);
        mainBodyShirt.addPoint(566, 289);
        mainBodyShirt.addPoint(578, 307);
        mainBodyShirt.addPoint(595, 323);
        mainBodyShirt.addPoint(603, 326);
        mainBodyShirt.addPoint(623, 342);
        mainBodyShirt.addPoint(651, 339);
        mainBodyShirt.addPoint(679, 369);
        mainBodyShirt.addPoint(681, 391);
        mainBodyShirt.addPoint(686, 400);
        mainBodyShirt.addPoint(683, 424);
        mainBodyShirt.addPoint(667, 439);
        mainBodyShirt.addPoint(660, 461);
        mainBodyShirt.addPoint(645, 481);
        mainBodyShirt.addPoint(620, 486);
        mainBodyShirt.addPoint(612, 471);
        mainBodyShirt.addPoint(600, 477);
        mainBodyShirt.addPoint(555, 471);
        mainBodyShirt.addPoint(555, 466);
        mainBodyShirt.addPoint(525, 435);
        mainBodyShirt.addPoint(511, 432);
        mainBodyShirt.addPoint(425, 427);
        mainBodyShirt.addPoint(400, 439);
        mainBodyShirt.addPoint(408, 452);
        mainBodyShirt.addPoint(396, 460);
        mainBodyShirt.addPoint(385, 466);
        mainBodyShirt.addPoint(369, 467);
        mainBodyShirt.addPoint(331, 500);
        mainBodyShirt.addPoint(304, 500);
        mainBodyShirt.addPoint(300, 485);
        mainBodyShirt.addPoint(267, 485);
        mainBodyShirt.addPoint(249, 454);
        mainBodyShirt.addPoint(272, 370);
        mainBodyShirt.addPoint(297, 340);
        mainBodyShirt.addPoint(309, 334);
        mainBodyShirt.addPoint(330, 330);
        mainBodyShirt.addPoint(329, 326);
        mainBodyShirt.addPoint(291, 308);
        mainBodyShirt.addPoint(283, 299);
        mainBodyShirt.addPoint(292, 295);
        mainBodyShirt.addPoint(292, 290);
        mainBodyShirt.addPoint(280, 294);
        mainBodyShirt.addPoint(268, 271);
        mainBodyShirt.addPoint(253, 250);
        mainBodyShirt.addPoint(256, 243);
        mainBodyShirt.addPoint(279, 260);
        mainBodyShirt.addPoint(304, 273);
        mainBodyShirt.addPoint(349, 290);
        mainBodyShirt.addPoint(376, 291);
        mainBodyShirt.addPoint(405, 289);
        mainBodyShirt.addPoint(427, 284);
        mainBodyShirt.addPoint(428, 264);

        Polygon mainBodyBrown1 = new Polygon();
        mainBodyBrown1.addPoint(651, 341);
        mainBodyBrown1.addPoint(633, 341);
        mainBodyBrown1.addPoint(628, 350);
        mainBodyBrown1.addPoint(663, 364);
        mainBodyBrown1.addPoint(671, 389);
        mainBodyBrown1.addPoint(679, 375);
        mainBodyBrown1.addPoint(677, 370);

        Polygon mainBodyBrown2 = new Polygon();
        mainBodyBrown2.addPoint(543, 319);
        mainBodyBrown2.addPoint(526, 326);
        mainBodyBrown2.addPoint(487, 352);
        mainBodyBrown2.addPoint(512, 375);
        mainBodyBrown2.addPoint(580, 432);
        mainBodyBrown2.addPoint(650, 402);
        mainBodyBrown2.addPoint(657, 403);
        mainBodyBrown2.addPoint(658, 418);
        mainBodyBrown2.addPoint(624, 456);
        mainBodyBrown2.addPoint(630, 470);
        mainBodyBrown2.addPoint(634, 470);
        mainBodyBrown2.addPoint(656, 443);
        mainBodyBrown2.addPoint(663, 426);
        mainBodyBrown2.addPoint(664, 404);
        mainBodyBrown2.addPoint(656, 376);
        mainBodyBrown2.addPoint(646, 372);
        mainBodyBrown2.addPoint(623, 370);
        mainBodyBrown2.addPoint(609, 366);
        mainBodyBrown2.addPoint(554, 323);

        Polygon mainBodyBrown3 = new Polygon();
        mainBodyBrown3.addPoint(622, 457);
        mainBodyBrown3.addPoint(612, 468);
        mainBodyBrown3.addPoint(620, 482);
        mainBodyBrown3.addPoint(630, 473);

        Polygon mainBodyBrown4 = new Polygon();
        mainBodyBrown4.addPoint(502, 376);
        mainBodyBrown4.addPoint(476, 363);
        mainBodyBrown4.addPoint(469, 368);
        mainBodyBrown4.addPoint(544, 448);
        mainBodyBrown4.addPoint(568, 447);

        Polygon mainBodyBrown5 = new Polygon();
        mainBodyBrown5.addPoint(463, 373);
        mainBodyBrown5.addPoint(446, 392);
        mainBodyBrown5.addPoint(439, 407);
        mainBodyBrown5.addPoint(448, 412);
        mainBodyBrown5.addPoint(494, 415);

        Polygon mainBodyBrown6 = new Polygon();
        mainBodyBrown6.addPoint(335, 432);
        mainBodyBrown6.addPoint(379, 429);
        mainBodyBrown6.addPoint(418, 418);
        mainBodyBrown6.addPoint(418, 387);

        Polygon mainBodyBrown7 = new Polygon();
        mainBodyBrown7.addPoint(341, 479);
        mainBodyBrown7.addPoint(318, 487);
        mainBodyBrown7.addPoint(309, 495);
        mainBodyBrown7.addPoint(312, 497);
        mainBodyBrown7.addPoint(322, 495);

        Polygon mainBodyBrown8 = new Polygon();
        mainBodyBrown8.addPoint(267, 465);
        mainBodyBrown8.addPoint(267, 469);
        mainBodyBrown8.addPoint(286, 481);
        mainBodyBrown8.addPoint(296, 480);
        mainBodyBrown8.addPoint(333, 465);

        Polygon mainBodyBrown9 = new Polygon();
        mainBodyBrown9.addPoint(332, 331);
        mainBodyBrown9.addPoint(315, 334);
        mainBodyBrown9.addPoint(302, 343);
        mainBodyBrown9.addPoint(295, 350);
        mainBodyBrown9.addPoint(291, 364);
        mainBodyBrown9.addPoint(306, 363);
        mainBodyBrown9.addPoint(305, 359);
        mainBodyBrown9.addPoint(306, 364);
        mainBodyBrown9.addPoint(313, 352);
        mainBodyBrown9.addPoint(321, 347);
        mainBodyBrown9.addPoint(323, 343);

        Polygon mainBodyBrown10 = new Polygon();
        mainBodyBrown10.addPoint(260, 247);
        mainBodyBrown10.addPoint(258, 255);
        mainBodyBrown10.addPoint(266, 266);
        mainBodyBrown10.addPoint(288, 279);
        mainBodyBrown10.addPoint(277, 259);

        Polygon mainBodyBrown11 = new Polygon();
        mainBodyBrown11.addPoint(431, 263);
        mainBodyBrown11.addPoint(431, 276);
        mainBodyBrown11.addPoint(460, 273);
        mainBodyBrown11.addPoint(465, 242);
        mainBodyBrown11.addPoint(451, 252);

        Polygon mainBodyBrown12 = new Polygon();
        mainBodyBrown12.addPoint(293, 268);
        mainBodyBrown12.addPoint(326, 309);
        mainBodyBrown12.addPoint(354, 292);

        //DRAWING
        // MAIN BODY
        gc.setColor(new Color(67, 20, 13));
        gc.drawPolygon(mainBodyShirt);
        gc.fillPolygon(mainBodyShirt);

        //LIGHT BROWN PARTS

        //DRAW
        gc.setStroke(1);
        gc.setColor(new Color(169, 73, 32));
        gc.drawPolygon(mainBodyBrown1);
        gc.drawPolygon(mainBodyBrown2);
        gc.drawPolygon(mainBodyBrown3);
        gc.drawPolygon(mainBodyBrown4);
        gc.drawPolygon(mainBodyBrown5);
        gc.drawPolygon(mainBodyBrown6);
        gc.drawPolygon(mainBodyBrown7);
        gc.drawPolygon(mainBodyBrown8);
        gc.drawPolygon(mainBodyBrown9);
        gc.drawPolygon(mainBodyBrown10);
        gc.drawPolygon(mainBodyBrown11);
        gc.drawPolygon(mainBodyBrown12);


        //FILL
        gc.setColor(new Color(152, 54, 6));
        gc.fillPolygon(mainBodyBrown1);
        gc.fillPolygon(mainBodyBrown2);
        gc.fillPolygon(mainBodyBrown3);
        gc.fillPolygon(mainBodyBrown4);
        gc.fillPolygon(mainBodyBrown5);
        gc.fillPolygon(mainBodyBrown6);
        gc.fillPolygon(mainBodyBrown7);
        gc.fillPolygon(mainBodyBrown8);
        gc.fillPolygon(mainBodyBrown9);
        gc.fillPolygon(mainBodyBrown10);
        gc.fillPolygon(mainBodyBrown11);
        gc.fillPolygon(mainBodyBrown12);

        gc.setColor(new Color(204, 110, 92));
        gc.fillOval(298, 297, 14, 4);
        gc.fillOval(352, 308, 13, 4);


        // LOWER CAPE

        //POLYGONS

        Polygon mainLeftCape = new Polygon();
        mainLeftCape.addPoint(167, 407);
        mainLeftCape.addPoint(168, 416);
        mainLeftCape.addPoint(185, 435);
        mainLeftCape.addPoint(194, 457);
        mainLeftCape.addPoint(214, 477);
        mainLeftCape.addPoint(226, 474);
        mainLeftCape.addPoint(256, 450);
        mainLeftCape.addPoint(302, 405);
        mainLeftCape.addPoint(305, 399);
        mainLeftCape.addPoint(269, 403);
        mainLeftCape.addPoint(272, 371);
        mainLeftCape.addPoint(297, 340);
        mainLeftCape.addPoint(309, 334);
        mainLeftCape.addPoint(332, 329);
        mainLeftCape.addPoint(329, 326);
        mainLeftCape.addPoint(291, 308);
        mainLeftCape.addPoint(283, 301);
        mainLeftCape.addPoint(274, 303);
        mainLeftCape.addPoint(232, 346);
        mainLeftCape.addPoint(220, 370);
        mainLeftCape.addPoint(215, 366);
        mainLeftCape.addPoint(208, 377);
        mainLeftCape.addPoint(201, 378);
        mainLeftCape.addPoint(184, 389);

        Polygon leftCapeDark1 = new Polygon();
        leftCapeDark1.addPoint(241, 338);
        leftCapeDark1.addPoint(226, 338);
        leftCapeDark1.addPoint(233, 343);
        leftCapeDark1.addPoint(230, 352);
        leftCapeDark1.addPoint(246, 346);

        Polygon leftCapeDark2 = new Polygon();
        leftCapeDark2.addPoint(249, 344);
        leftCapeDark2.addPoint(260, 331);
        leftCapeDark2.addPoint(261, 326);
        leftCapeDark2.addPoint(266, 327);
        leftCapeDark2.addPoint(277, 318);
        leftCapeDark2.addPoint(277, 313);
        leftCapeDark2.addPoint(274, 303);
        leftCapeDark2.addPoint(284, 302);
        leftCapeDark2.addPoint(291, 309);
        leftCapeDark2.addPoint(330, 328);
        leftCapeDark2.addPoint(327, 330);
        leftCapeDark2.addPoint(317, 326);
        leftCapeDark2.addPoint(305, 327);
        leftCapeDark2.addPoint(288, 334);
        leftCapeDark2.addPoint(279, 340);
        leftCapeDark2.addPoint(260, 340);

        Polygon leftCapeWhite1 = new Polygon();
        leftCapeWhite1.addPoint(216, 446);
        leftCapeWhite1.addPoint(216, 459);
        leftCapeWhite1.addPoint(230, 458);

        Polygon leftCapeWhite2 = new Polygon();
        leftCapeWhite2.addPoint(235, 421);
        leftCapeWhite2.addPoint(237, 434);
        leftCapeWhite2.addPoint(254, 422);

        Polygon leftCapeWhite3 = new Polygon();
        leftCapeWhite3.addPoint(198, 417);
        leftCapeWhite3.addPoint(194, 431);
        leftCapeWhite3.addPoint(211, 423);

        Polygon leftCapeWhite4 = new Polygon();
        leftCapeWhite4.addPoint(220, 395);
        leftCapeWhite4.addPoint(215, 409);
        leftCapeWhite4.addPoint(233, 397);

        Polygon leftCapeWhite5 = new Polygon();
        leftCapeWhite5.addPoint(195, 392);
        leftCapeWhite5.addPoint(202, 400);
        leftCapeWhite5.addPoint(185, 404);

        Polygon leftCapeWhite6 = new Polygon();
        leftCapeWhite6.addPoint(217, 374);
        leftCapeWhite6.addPoint(224, 374);
        leftCapeWhite6.addPoint(218, 383);
        leftCapeWhite6.addPoint(208, 387);

        Polygon leftCapeWhite7 = new Polygon();
        leftCapeWhite7.addPoint(237, 362);
        leftCapeWhite7.addPoint(250, 360);
        leftCapeWhite7.addPoint(236, 373);

        Polygon leftCapeWhite8 = new Polygon();
        leftCapeWhite8.addPoint(253, 394);
        leftCapeWhite8.addPoint(246, 381);
        leftCapeWhite8.addPoint(267, 374);

        Polygon leftCapeWhite9 = new Polygon();
        leftCapeWhite9.addPoint(269, 348);
        leftCapeWhite9.addPoint(288, 340);
        leftCapeWhite9.addPoint(274, 355);


        //DRAWINGS

        gc.setStroke(1);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(mainLeftCape);
        gc.setColor(new Color(248, 86, 0));
        gc.fillPolygon(mainLeftCape);

        gc.setColor(Color.BLACK);

        gc.drawPolygon(leftCapeDark2);

        gc.setStroke(2);
        gc.drawPolygon(leftCapeWhite1);
        gc.drawPolygon(leftCapeWhite2);
        gc.drawPolygon(leftCapeWhite3);
        gc.drawPolygon(leftCapeWhite4);
        gc.drawPolygon(leftCapeWhite5);
        gc.drawPolygon(leftCapeWhite6);
        gc.drawPolygon(leftCapeWhite7);
        gc.drawPolygon(leftCapeWhite8);
        gc.drawPolygon(leftCapeWhite9);

        //FILL

        gc.setColor(new Color(160, 71, 12));
        gc.fillPolygon(leftCapeDark1);
        gc.fillPolygon(leftCapeDark2);

        gc.setColor(new Color(255, 229, 210));
        gc.fillPolygon(leftCapeWhite1);
        gc.fillPolygon(leftCapeWhite2);
        gc.fillPolygon(leftCapeWhite3);
        gc.fillPolygon(leftCapeWhite4);
        gc.fillPolygon(leftCapeWhite5);
        gc.fillPolygon(leftCapeWhite6);
        gc.fillPolygon(leftCapeWhite7);
        gc.fillPolygon(leftCapeWhite8);
        gc.fillPolygon(leftCapeWhite9);


        //UPPER CAPE

        // POLYGONS

        Polygon upperLeftMainCape = new Polygon();
        upperLeftMainCape.addPoint(248, 232);
        upperLeftMainCape.addPoint(256, 243);
        upperLeftMainCape.addPoint(279, 260);
        upperLeftMainCape.addPoint(304, 273);
        upperLeftMainCape.addPoint(329, 283);
        upperLeftMainCape.addPoint(350, 290);
        upperLeftMainCape.addPoint(376, 291);
        upperLeftMainCape.addPoint(405, 289);
        upperLeftMainCape.addPoint(436, 283);
        upperLeftMainCape.addPoint(435, 276);
        upperLeftMainCape.addPoint(430, 276);
        upperLeftMainCape.addPoint(430, 263);
        upperLeftMainCape.addPoint(527, 125);
        upperLeftMainCape.addPoint(526, 103);
        upperLeftMainCape.addPoint(518, 89);
        upperLeftMainCape.addPoint(505, 74);
        upperLeftMainCape.addPoint(488, 43);
        upperLeftMainCape.addPoint(472, 44);
        upperLeftMainCape.addPoint(450, 58);
        upperLeftMainCape.addPoint(424, 81);
        upperLeftMainCape.addPoint(393, 119);
        upperLeftMainCape.addPoint(348, 148);
        upperLeftMainCape.addPoint(332, 152);
        upperLeftMainCape.addPoint(308, 164);
        upperLeftMainCape.addPoint(284, 182);
        upperLeftMainCape.addPoint(264, 219);

        Polygon upperRightMainCape = new Polygon();
        upperRightMainCape.addPoint(485, 263);
        upperRightMainCape.addPoint(508, 252);
        upperRightMainCape.addPoint(541, 225);
        upperRightMainCape.addPoint(573, 189);
        upperRightMainCape.addPoint(580, 179);
        upperRightMainCape.addPoint(595, 167);
        upperRightMainCape.addPoint(614, 155);
        upperRightMainCape.addPoint(657, 135);
        upperRightMainCape.addPoint(683, 124);
        upperRightMainCape.addPoint(709, 117);
        upperRightMainCape.addPoint(708, 115);
        upperRightMainCape.addPoint(696, 105);
        upperRightMainCape.addPoint(683, 96);
        upperRightMainCape.addPoint(664, 87);
        upperRightMainCape.addPoint(646, 80);
        upperRightMainCape.addPoint(629, 77);
        upperRightMainCape.addPoint(609, 77);
        upperRightMainCape.addPoint(586, 79);
        upperRightMainCape.addPoint(572, 84);
        upperRightMainCape.addPoint(559, 95);
        upperRightMainCape.addPoint(527, 126);
        upperRightMainCape.addPoint(523, 143);
        upperRightMainCape.addPoint(515, 163);
        upperRightMainCape.addPoint(505, 183);
        upperRightMainCape.addPoint(485, 211);

        Polygon upperMiddleMainCape = new Polygon();
        upperMiddleMainCape.addPoint(420, 267);
        upperMiddleMainCape.addPoint(415, 259);
        upperMiddleMainCape.addPoint(412, 245);
        upperMiddleMainCape.addPoint(427, 210);
        upperMiddleMainCape.addPoint(446, 171);
        upperMiddleMainCape.addPoint(450, 157);
        upperMiddleMainCape.addPoint(450, 129);
        upperMiddleMainCape.addPoint(441, 110);
        upperMiddleMainCape.addPoint(424, 110);
        upperMiddleMainCape.addPoint(393, 121);
        upperMiddleMainCape.addPoint(424, 82);
        upperMiddleMainCape.addPoint(449, 57);
        upperMiddleMainCape.addPoint(472, 45);
        upperMiddleMainCape.addPoint(489, 42);
        upperMiddleMainCape.addPoint(504, 72);
        upperMiddleMainCape.addPoint(518, 89);
        upperMiddleMainCape.addPoint(526, 103);
        upperMiddleMainCape.addPoint(527, 125);
        upperMiddleMainCape.addPoint(522, 143);
        upperMiddleMainCape.addPoint(515, 165);
        upperMiddleMainCape.addPoint(504, 184);
        upperMiddleMainCape.addPoint(485, 211);
        upperMiddleMainCape.addPoint(470, 228);
        upperMiddleMainCape.addPoint(456, 243);
        upperMiddleMainCape.addPoint(444, 252);

        Polygon rightCapeAbove = new Polygon();
        rightCapeAbove.addPoint(525, 126);
        rightCapeAbove.addPoint(532, 121);
        rightCapeAbove.addPoint(537, 135);
        rightCapeAbove.addPoint(543, 158);
        rightCapeAbove.addPoint(548, 181);
        rightCapeAbove.addPoint(548, 202);
        rightCapeAbove.addPoint(547, 219);
        rightCapeAbove.addPoint(541, 226);
        rightCapeAbove.addPoint(508, 252);
        rightCapeAbove.addPoint(484, 264);
        rightCapeAbove.addPoint(485, 211);
        rightCapeAbove.addPoint(504, 183);
        rightCapeAbove.addPoint(514, 163);
        rightCapeAbove.addPoint(523, 143);

        Polygon middleCapeAbove = new Polygon();
        middleCapeAbove.addPoint(314, 212);
        middleCapeAbove.addPoint(325, 228);
        middleCapeAbove.addPoint(340, 240);
        middleCapeAbove.addPoint(364, 250);
        middleCapeAbove.addPoint(375, 246);
        middleCapeAbove.addPoint(387, 246);
        middleCapeAbove.addPoint(391, 250);
        middleCapeAbove.addPoint(406, 250);
        middleCapeAbove.addPoint(412, 245);
        middleCapeAbove.addPoint(421, 224);
        middleCapeAbove.addPoint(428, 209);
        middleCapeAbove.addPoint(447, 171);
        middleCapeAbove.addPoint(450, 159);
        middleCapeAbove.addPoint(450, 128);
        middleCapeAbove.addPoint(447, 118);
        middleCapeAbove.addPoint(441, 111);
        middleCapeAbove.addPoint(424, 109);
        middleCapeAbove.addPoint(393, 121);
        middleCapeAbove.addPoint(348, 149);
        middleCapeAbove.addPoint(331, 166);
        middleCapeAbove.addPoint(319, 190);

        Polygon darkOrangeMiddle1 = new Polygon();
        darkOrangeMiddle1.addPoint(440, 110);
        darkOrangeMiddle1.addPoint(474, 109);
        darkOrangeMiddle1.addPoint(483, 117);
        darkOrangeMiddle1.addPoint(483, 134);
        darkOrangeMiddle1.addPoint(478, 149);
        darkOrangeMiddle1.addPoint(459, 178);
        darkOrangeMiddle1.addPoint(423, 220);
        darkOrangeMiddle1.addPoint(427, 208);
        darkOrangeMiddle1.addPoint(446, 171);
        darkOrangeMiddle1.addPoint(450, 161);
        darkOrangeMiddle1.addPoint(451, 129);
        darkOrangeMiddle1.addPoint(447, 118);

        Polygon darkOrangeMiddle2 = new Polygon();
        darkOrangeMiddle2.addPoint(426, 120);
        darkOrangeMiddle2.addPoint(420, 132);
        darkOrangeMiddle2.addPoint(419, 154);
        darkOrangeMiddle2.addPoint(427, 170);

        Polygon lightBrownCape1 = new Polygon();
        lightBrownCape1.addPoint(387, 250);
        lightBrownCape1.addPoint(406, 250);
        lightBrownCape1.addPoint(403, 260);
        lightBrownCape1.addPoint(391, 273);
        lightBrownCape1.addPoint(380, 279);
        lightBrownCape1.addPoint(366, 276);
        lightBrownCape1.addPoint(393, 256);

        Polygon lightBrownCape2 = new Polygon();
        lightBrownCape2.addPoint(409, 255);
        lightBrownCape2.addPoint(421, 266);
        lightBrownCape2.addPoint(429, 265);
        lightBrownCape2.addPoint(430, 276);
        lightBrownCape2.addPoint(436, 276);
        lightBrownCape2.addPoint(436, 282);
        lightBrownCape2.addPoint(403, 288);
        lightBrownCape2.addPoint(411, 276);

        Polygon lightBrownCape3 = new Polygon();
        lightBrownCape3.addPoint(352, 258);
        lightBrownCape3.addPoint(325, 260);
        lightBrownCape3.addPoint(301, 255);
        lightBrownCape3.addPoint(314, 265);

        Polygon lightBrownCape4 = new Polygon();
        lightBrownCape4.addPoint(325, 193);
        lightBrownCape4.addPoint(329, 194);
        lightBrownCape4.addPoint(374, 231);
        lightBrownCape4.addPoint(387, 246);
        lightBrownCape4.addPoint(376, 245);
        lightBrownCape4.addPoint(367, 233);
        lightBrownCape4.addPoint(345, 215);
        lightBrownCape4.addPoint(327, 202);

        Polygon darkBrownCape1 = new Polygon();
        darkBrownCape1.addPoint(412, 244);
        darkBrownCape1.addPoint(416, 261);
        darkBrownCape1.addPoint(409, 257);
        darkBrownCape1.addPoint(403, 261);
        darkBrownCape1.addPoint(406, 249);

        Polygon darkBrownCape2 = new Polygon();
        darkBrownCape2.addPoint(375, 246);
        darkBrownCape2.addPoint(389, 247);
        darkBrownCape2.addPoint(351, 258);
        darkBrownCape2.addPoint(364, 250);

        Polygon darkBrownCape3 = new Polygon();
        darkBrownCape3.addPoint(429, 175);
        darkBrownCape3.addPoint(430, 185);
        darkBrownCape3.addPoint(427, 207);
        darkBrownCape3.addPoint(447, 172);
        darkBrownCape3.addPoint(434, 189);

        Polygon darkBrownCape4 = new Polygon();
        darkBrownCape4.addPoint(420, 131);
        darkBrownCape4.addPoint(417, 136);
        darkBrownCape4.addPoint(415, 154);
        darkBrownCape4.addPoint(416, 160);
        darkBrownCape4.addPoint(429, 175);
        darkBrownCape4.addPoint(427, 168);
        darkBrownCape4.addPoint(419, 154);

        //TRIANGLES
        Polygon capeTopWhite1 = new Polygon();
        capeTopWhite1.addPoint(407, 276);
        capeTopWhite1.addPoint(395, 286);
        capeTopWhite1.addPoint(383, 275);

        Polygon capeTopWhite2 = new Polygon();
        capeTopWhite2.addPoint(332, 278);
        capeTopWhite2.addPoint(340, 269);
        capeTopWhite2.addPoint(317, 267);

        Polygon capeTopWhite3 = new Polygon();
        capeTopWhite3.addPoint(387, 247);
        capeTopWhite3.addPoint(391, 250);
        capeTopWhite3.addPoint(382, 259);
        capeTopWhite3.addPoint(370, 255);

        Polygon capeTopWhite4 = new Polygon();
        capeTopWhite4.addPoint(327, 253);
        capeTopWhite4.addPoint(331, 240);
        capeTopWhite4.addPoint(308, 242);

        Polygon capeTopWhite5 = new Polygon();
        capeTopWhite5.addPoint(284, 232);
        capeTopWhite5.addPoint(290, 245);
        capeTopWhite5.addPoint(272, 237);

        Polygon capeTopWhite6 = new Polygon();
        capeTopWhite6.addPoint(271, 207);
        capeTopWhite6.addPoint(264, 219);
        capeTopWhite6.addPoint(270, 218);

        Polygon capeTopWhite7 = new Polygon();
        capeTopWhite7.addPoint(635, 101);
        capeTopWhite7.addPoint(659, 116);
        capeTopWhite7.addPoint(620, 129);

        Polygon capeTopWhite8 = new Polygon();
        capeTopWhite8.addPoint(288, 201);
        capeTopWhite8.addPoint(297, 212);
        capeTopWhite8.addPoint(306, 192);

        Polygon capeTopWhite9 = new Polygon();
        capeTopWhite9.addPoint(302, 169);
        capeTopWhite9.addPoint(294, 175);
        capeTopWhite9.addPoint(298, 178);

        Polygon capeTopWhite10 = new Polygon();
        capeTopWhite10.addPoint(337, 187);
        capeTopWhite10.addPoint(366, 180);
        capeTopWhite10.addPoint(356, 200);

        Polygon capeTopWhite11 = new Polygon();
        capeTopWhite11.addPoint(370, 141);
        capeTopWhite11.addPoint(361, 156);
        capeTopWhite11.addPoint(351, 151);

        Polygon capeTopWhite12 = new Polygon();
        capeTopWhite12.addPoint(415, 133);
        capeTopWhite12.addPoint(386, 154);
        capeTopWhite12.addPoint(409, 156);

        Polygon capeTopWhite13 = new Polygon();
        capeTopWhite13.addPoint(415, 211);
        capeTopWhite13.addPoint(422, 192);
        capeTopWhite13.addPoint(396, 200);

        Polygon capeTopWhite14 = new Polygon();
        capeTopWhite14.addPoint(439, 151);
        capeTopWhite14.addPoint(449, 159);
        capeTopWhite14.addPoint(445, 170);

        Polygon capeTopWhite15 = new Polygon();
        capeTopWhite15.addPoint(442, 119);
        capeTopWhite15.addPoint(448, 119);
        capeTopWhite15.addPoint(450, 127);

        Polygon capeTopWhite16 = new Polygon();
        capeTopWhite16.addPoint(442, 82);
        capeTopWhite16.addPoint(441, 98);
        capeTopWhite16.addPoint(425, 94);

        Polygon capeTopWhite17 = new Polygon();
        capeTopWhite17.addPoint(474, 45);
        capeTopWhite17.addPoint(464, 60);
        capeTopWhite17.addPoint(448, 59);

        Polygon capeTopWhite18 = new Polygon();
        capeTopWhite18.addPoint(497, 76);
        capeTopWhite18.addPoint(491, 97);
        capeTopWhite18.addPoint(471, 93);

        Polygon capeTopWhite19 = new Polygon();
        capeTopWhite19.addPoint(429, 223);
        capeTopWhite19.addPoint(427, 242);
        capeTopWhite19.addPoint(446, 243);

        Polygon capeTopWhite20 = new Polygon();
        capeTopWhite20.addPoint(460, 182);
        capeTopWhite20.addPoint(466, 202);
        capeTopWhite20.addPoint(487, 195);

        Polygon capeTopWhite21 = new Polygon();
        capeTopWhite21.addPoint(482, 137);
        capeTopWhite21.addPoint(511, 139);
        capeTopWhite21.addPoint(497, 152);

        Polygon capeTopWhite22 = new Polygon();
        capeTopWhite22.addPoint(548, 184);
        capeTopWhite22.addPoint(556, 191);
        capeTopWhite22.addPoint(548, 197);

        Polygon capeTopWhite23 = new Polygon();
        capeTopWhite23.addPoint(565, 125);
        capeTopWhite23.addPoint(586, 133);
        capeTopWhite23.addPoint(553, 152);

        Polygon capeTopWhite24 = new Polygon();
        capeTopWhite24.addPoint(572, 90);
        capeTopWhite24.addPoint(591, 91);
        capeTopWhite24.addPoint(565, 109);

        Polygon capeTopWhite25 = new Polygon();
        capeTopWhite25.addPoint(359, 235);
        capeTopWhite25.addPoint(385, 231);
        capeTopWhite25.addPoint(375, 244);

        Polygon capeTopWhite26 = new Polygon();
        capeTopWhite26.addPoint(329, 282);
        capeTopWhite26.addPoint(336, 285);
        capeTopWhite26.addPoint(335, 296);
        capeTopWhite26.addPoint(329, 294);

        Polygon capeTopWhite27 = new Polygon();
        capeTopWhite27.addPoint(323, 280);
        capeTopWhite27.addPoint(329, 282);
        capeTopWhite27.addPoint(329, 294);
        capeTopWhite27.addPoint(323, 291);


        Polygon capeTopPink1 = new Polygon();
        capeTopPink1.addPoint(548, 184);
        capeTopPink1.addPoint(543, 180);
        capeTopPink1.addPoint(529, 209);
        capeTopPink1.addPoint(548, 198);

        Polygon capeTopPink2 = new Polygon();
        capeTopPink2.addPoint(513, 166);
        capeTopPink2.addPoint(519, 171);
        capeTopPink2.addPoint(507, 179);

        Polygon capeTopPink3 = new Polygon();
        capeTopPink3.addPoint(448, 118);
        capeTopPink3.addPoint(469, 119);
        capeTopPink3.addPoint(455, 132);
        capeTopPink3.addPoint(451, 127);

        Polygon capeTopPink4 = new Polygon();
        capeTopPink4.addPoint(449, 159);
        capeTopPink4.addPoint(456, 168);
        capeTopPink4.addPoint(445, 171);

        Polygon capeTopPink5 = new Polygon();
        capeTopPink5.addPoint(526, 126);
        capeTopPink5.addPoint(533, 130);
        capeTopPink5.addPoint(524, 138);

        Polygon capeTopPink6 = new Polygon();
        capeTopPink6.addPoint(486, 209);
        capeTopPink6.addPoint(498, 215);
        capeTopPink6.addPoint(485, 224);

        Polygon capeTopPink7 = new Polygon();
        capeTopPink7.addPoint(286, 313);
        capeTopPink7.addPoint(288, 325);
        capeTopPink7.addPoint(299, 325);

        Polygon lightBrownPart = new Polygon();
        lightBrownPart.addPoint(367, 233);
        lightBrownPart.addPoint(374, 232);
        lightBrownPart.addPoint(380, 237);
        lightBrownPart.addPoint(377, 242);

        //DRAWINGS & FILLINGS

        gc.setStroke(2);
        gc.setColor(Color.BLACK);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(upperRightMainCape);
        gc.setColor(new Color(255, 139, 0));
        gc.fillPolygon(upperRightMainCape);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(upperLeftMainCape);
        gc.setColor(new Color(250, 191, 3));
        gc.fillPolygon(upperLeftMainCape);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(upperMiddleMainCape);
        gc.setColor(new Color(252, 119, 8));
        gc.fillPolygon(upperMiddleMainCape);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(rightCapeAbove);
        gc.setColor(new Color(208, 67, 13));
        gc.fillPolygon(rightCapeAbove);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(middleCapeAbove);
        gc.setColor(new Color(255, 217, 2));
        gc.fillPolygon(middleCapeAbove);

        gc.setStroke(1);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(darkOrangeMiddle2);
        gc.setColor(new Color(253, 94, 1));
        gc.fillPolygon(darkOrangeMiddle1);
        gc.fillPolygon(darkOrangeMiddle2);

        gc.setColor(new Color(231, 134, 18));
        gc.fillPolygon(lightBrownCape1);
        gc.fillPolygon(lightBrownCape2);
        gc.fillPolygon(lightBrownCape3);
        gc.fillPolygon(lightBrownCape4);

        gc.setColor(new Color(82, 17, 0));
        gc.fillPolygon(darkBrownCape1);
        gc.fillPolygon(darkBrownCape2);
        gc.fillPolygon(darkBrownCape3);
        gc.fillPolygon(darkBrownCape4);


        gc.setStroke(2);
        //DRAWING TRIANGLES
        gc.setColor(Color.BLACK);
        gc.drawPolygon(capeTopWhite1);
        gc.drawPolygon(capeTopWhite2);
        gc.drawPolygon(capeTopWhite3);
        gc.drawPolygon(capeTopWhite4);
        gc.drawPolygon(capeTopWhite5);
        gc.drawPolygon(capeTopWhite6);
        gc.drawPolygon(capeTopWhite7);
        gc.drawPolygon(capeTopWhite8);
        gc.drawPolygon(capeTopWhite9);
        gc.drawPolygon(capeTopWhite10);
        gc.drawPolygon(capeTopWhite11);
        gc.drawPolygon(capeTopWhite12);
        gc.drawPolygon(capeTopWhite13);
        gc.drawPolygon(capeTopWhite14);
        gc.drawPolygon(capeTopWhite15);
        gc.drawPolygon(capeTopWhite16);
        gc.drawPolygon(capeTopWhite17);
        gc.drawPolygon(capeTopWhite18);
        gc.drawPolygon(capeTopWhite19);
        gc.drawPolygon(capeTopWhite20);
        gc.drawPolygon(capeTopWhite21);
        gc.drawPolygon(capeTopWhite22);
        gc.drawPolygon(capeTopWhite23);
        gc.drawPolygon(capeTopWhite24);
        gc.drawPolygon(capeTopWhite25);

        gc.drawPolygon(capeTopPink1);
        gc.drawPolygon(capeTopPink2);
        gc.drawPolygon(capeTopPink3);
        gc.drawPolygon(capeTopPink4);
        gc.drawPolygon(capeTopPink5);
        gc.drawPolygon(capeTopPink6);
        gc.drawPolygon(capeTopPink7);


        //FILLING TRIANGLES
        gc.setColor(new Color(255, 254, 241));
        gc.fillPolygon(capeTopWhite1);
        gc.fillPolygon(capeTopWhite2);
        gc.fillPolygon(capeTopWhite3);
        gc.fillPolygon(capeTopWhite4);
        gc.fillPolygon(capeTopWhite5);
        gc.fillPolygon(capeTopWhite6);
        gc.fillPolygon(capeTopWhite7);
        gc.fillPolygon(capeTopWhite8);
        gc.fillPolygon(capeTopWhite9);
        gc.fillPolygon(capeTopWhite10);
        gc.fillPolygon(capeTopWhite11);
        gc.fillPolygon(capeTopWhite12);
        gc.fillPolygon(capeTopWhite13);
        gc.fillPolygon(capeTopWhite14);
        gc.fillPolygon(capeTopWhite15);
        gc.fillPolygon(capeTopWhite16);
        gc.fillPolygon(capeTopWhite17);
        gc.fillPolygon(capeTopWhite18);
        gc.fillPolygon(capeTopWhite19);
        gc.fillPolygon(capeTopWhite20);
        gc.fillPolygon(capeTopWhite21);
        gc.fillPolygon(capeTopWhite22);
        gc.fillPolygon(capeTopWhite23);
        gc.fillPolygon(capeTopWhite24);
        gc.fillPolygon(capeTopWhite25);
        gc.fillPolygon(capeTopWhite26);
        gc.fillPolygon(capeTopWhite27);


        gc.setColor(new Color(253, 161, 129));
        gc.fillPolygon(capeTopPink1);
        gc.fillPolygon(capeTopPink2);
        gc.fillPolygon(capeTopPink3);
        gc.fillPolygon(capeTopPink4);
        gc.fillPolygon(capeTopPink5);
        gc.fillPolygon(capeTopPink6);
        gc.fillPolygon(capeTopPink7);

        gc.setColor(new Color(235, 155, 109));
        gc.fillPolygon(lightBrownPart);

        gc.setStroke(1);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(capeTopWhite26);
        gc.drawPolygon(capeTopWhite27);


        // OTHER "PINK" OBJECTS

        //POLYGONS
        Polygon pinkObject1 = new Polygon();
        pinkObject1.addPoint(268, 403);
        pinkObject1.addPoint(266, 416);
        pinkObject1.addPoint(263, 431);
        pinkObject1.addPoint(282, 416);
        pinkObject1.addPoint(297, 400);

        //COLLAR!!!
        Polygon pinkObject2 = new Polygon();
        pinkObject2.addPoint(252, 250);
        pinkObject2.addPoint(267, 271);
        pinkObject2.addPoint(279, 294);
        pinkObject2.addPoint(292, 290);
        pinkObject2.addPoint(292, 295);
        pinkObject2.addPoint(283, 300);
        pinkObject2.addPoint(273, 302);
        pinkObject2.addPoint(271, 292);
        pinkObject2.addPoint(264, 277);
        pinkObject2.addPoint(248, 254);

        Polygon pinkObject3 = new Polygon();
        pinkObject3.addPoint(527, 266);
        pinkObject3.addPoint(523, 263);
        pinkObject3.addPoint(515, 253);
        pinkObject3.addPoint(508, 253);
        pinkObject3.addPoint(540, 227);
        pinkObject3.addPoint(538, 242);
        pinkObject3.addPoint(533, 256);

        Polygon darkPinkObject1 = new Polygon();
        darkPinkObject1.addPoint(507, 253);
        darkPinkObject1.addPoint(500, 272);
        darkPinkObject1.addPoint(495, 281);
        darkPinkObject1.addPoint(471, 310);
        darkPinkObject1.addPoint(470, 290);
        darkPinkObject1.addPoint(488, 263);

        Polygon darkPinkObject2 = new Polygon();
        darkPinkObject2.addPoint(487, 263);
        darkPinkObject2.addPoint(500, 273);
        darkPinkObject2.addPoint(501, 277);
        darkPinkObject2.addPoint(497, 281);
        darkPinkObject2.addPoint(482, 271);
        darkPinkObject2.addPoint(481, 268);


        //DRAWING
        gc.setStroke(2);
        gc.drawPolygon(pinkObject1);
        gc.drawPolygon(pinkObject2);
        gc.drawPolygon(pinkObject3);

        //FILLING

        gc.setColor(new Color(244, 153, 123));
        gc.fillPolygon(pinkObject1);
        gc.fillPolygon(pinkObject2);
        gc.fillPolygon(pinkObject3);

        // SLEEVES

        //POLYGONS + DRAWING + FILLING
        Polygon leftSleevePink = new Polygon();
        leftSleevePink.addPoint(333, 330);
        leftSleevePink.addPoint(323, 343);
        leftSleevePink.addPoint(324, 383);
        leftSleevePink.addPoint(341, 382);
        leftSleevePink.addPoint(335, 366);
        leftSleevePink.addPoint(330, 344);

        gc.setColor(Color.BLACK);
        gc.setStroke(2);
        gc.drawPolygon(leftSleevePink);
        gc.setColor(new Color(221, 142, 133));
        gc.fillPolygon(leftSleevePink);

        Polygon leftSleeveWhite = new Polygon();
        leftSleeveWhite.addPoint(333, 330);
        leftSleeveWhite.addPoint(342, 328);
        leftSleeveWhite.addPoint(342, 332);
        leftSleeveWhite.addPoint(339, 341);
        leftSleeveWhite.addPoint(353, 367);
        leftSleeveWhite.addPoint(350, 377);
        leftSleeveWhite.addPoint(340, 379);
        leftSleeveWhite.addPoint(331, 344);

        gc.setColor(Color.black);
        gc.drawPolygon(leftSleeveWhite);
        gc.setColor(new Color(242, 205, 185));
        gc.fillPolygon(leftSleeveWhite);


        Polygon rightSleeveWhite = new Polygon();
        rightSleeveWhite.addPoint(475, 272);
        rightSleeveWhite.addPoint(475, 285);
        rightSleeveWhite.addPoint(436, 286);
        rightSleeveWhite.addPoint(436, 276);

        gc.setColor(Color.black);
        gc.drawPolygon(rightSleeveWhite);
        gc.setColor(new Color(254, 220, 192));
        gc.fillPolygon(rightSleeveWhite);

        Polygon rightSleevePink = new Polygon();
        rightSleevePink.addPoint(475, 272);
        rightSleevePink.addPoint(436, 276);
        rightSleevePink.addPoint(436, 282);
        rightSleevePink.addPoint(474, 278);

        gc.setColor(new Color(234, 152, 128));
        gc.fillPolygon(rightSleevePink);


        // SWORD!!

        Polygon swordHandle = new Polygon();
        swordHandle.addPoint(315, 352);
        swordHandle.addPoint(317, 362);
        swordHandle.addPoint(320, 370);
        swordHandle.addPoint(406, 339);
        swordHandle.addPoint(397, 320);

        gc.setStroke(2);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(swordHandle);
        gc.setColor(new Color(255, 228, 205));
        gc.fillPolygon(swordHandle);

        Polygon swordMiddleWhite1 = new Polygon();
        swordMiddleWhite1.addPoint(397, 319);
        swordMiddleWhite1.addPoint(403, 318);
        swordMiddleWhite1.addPoint(410, 333);
        swordMiddleWhite1.addPoint(410, 337);
        swordMiddleWhite1.addPoint(406, 340);
        swordMiddleWhite1.addPoint(403, 329);

        Polygon swordMiddleWhite2 = new Polygon();
        swordMiddleWhite2.addPoint(397, 319);
        swordMiddleWhite2.addPoint(395, 305);
        swordMiddleWhite2.addPoint(399, 305);
        swordMiddleWhite2.addPoint(413, 324);
        swordMiddleWhite2.addPoint(417, 334);
        swordMiddleWhite2.addPoint(420, 351);
        swordMiddleWhite2.addPoint(416, 351);
        swordMiddleWhite2.addPoint(407, 340);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(swordMiddleWhite2);
        gc.setColor(new Color(255, 221, 185));
        gc.fillPolygon(swordMiddleWhite2);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(swordMiddleWhite1);
        gc.setColor(new Color(255, 221, 185));
        gc.fillPolygon(swordMiddleWhite1);

        Polygon mainSword = new Polygon();
        mainSword.addPoint(410, 312);
        mainSword.addPoint(494, 283);
        mainSword.addPoint(593, 257);
        mainSword.addPoint(679, 236);
        mainSword.addPoint(727, 228);
        mainSword.addPoint(748, 226);
        mainSword.addPoint(752, 250);
        mainSword.addPoint(731, 252);
        mainSword.addPoint(687, 261);
        mainSword.addPoint(642, 270);
        mainSword.addPoint(565, 288);
        mainSword.addPoint(472, 315);
        mainSword.addPoint(422, 335);

        gc.setStroke(2);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(mainSword);
        gc.setColor(new Color(254, 226, 205));
        gc.fillPolygon(mainSword);

        Polygon swordOrange1 = new Polygon();
        swordOrange1.addPoint(315, 353);
        swordOrange1.addPoint(307, 355);
        swordOrange1.addPoint(305, 359);
        swordOrange1.addPoint(307, 363);
        swordOrange1.addPoint(308, 367);
        swordOrange1.addPoint(309, 371);
        swordOrange1.addPoint(314, 374);
        swordOrange1.addPoint(320, 371);
        swordOrange1.addPoint(316, 363);

        Polygon swordOrange2 = new Polygon();
        swordOrange2.addPoint(399, 305);
        swordOrange2.addPoint(415, 315);
        swordOrange2.addPoint(421, 329);
        swordOrange2.addPoint(424, 348);
        swordOrange2.addPoint(420, 350);
        swordOrange2.addPoint(417, 334);
        swordOrange2.addPoint(413, 325);

        Polygon swordOrange3 = new Polygon();
        swordOrange3.addPoint(744, 226);
        swordOrange3.addPoint(750, 228);
        swordOrange3.addPoint(755, 235);
        swordOrange3.addPoint(757, 247);
        swordOrange3.addPoint(756, 250);
        swordOrange3.addPoint(752, 250);
        swordOrange3.addPoint(743, 225);

        gc.setStroke(2);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(swordOrange1);
        gc.drawPolygon(swordOrange2);
        gc.drawPolygon(swordOrange3);

        gc.setColor(new Color(255, 166, 35));
        gc.fillPolygon(swordOrange1);
        gc.fillPolygon(swordOrange2);
        gc.fillPolygon(swordOrange3);

        //ORANGE TRIANGLES ON SWORD
        Polygon lightOrange1 = new Polygon();
        lightOrange1.addPoint(316, 357);
        lightOrange1.addPoint(322, 359);
        lightOrange1.addPoint(319, 366);
        lightOrange1.addPoint(316, 362);

        Polygon lightOrange2 = new Polygon();
        lightOrange2.addPoint(325, 353);
        lightOrange2.addPoint(332, 356);
        lightOrange2.addPoint(328, 362);

        Polygon lightOrange3 = new Polygon();
        lightOrange3.addPoint(344, 352);
        lightOrange3.addPoint(336, 349);
        lightOrange3.addPoint(339, 358);

        Polygon lightOrange4 = new Polygon();
        lightOrange4.addPoint(354, 347);
        lightOrange4.addPoint(351, 354);
        lightOrange4.addPoint(347, 345);

        Polygon lightOrange5 = new Polygon();
        lightOrange5.addPoint(367, 341);
        lightOrange5.addPoint(361, 340);
        lightOrange5.addPoint(364, 346);

        Polygon lightOrange6 = new Polygon();
        lightOrange6.addPoint(380, 337);
        lightOrange6.addPoint(376, 345);
        lightOrange6.addPoint(370, 335);

        Polygon lightOrange7 = new Polygon();
        lightOrange7.addPoint(391, 332);
        lightOrange7.addPoint(384, 330);
        lightOrange7.addPoint(388, 339);

        Polygon lightOrange8 = new Polygon();
        lightOrange8.addPoint(401, 328);
        lightOrange8.addPoint(398, 336);
        lightOrange8.addPoint(393, 326);


        gc.setColor(Color.BLACK);
        gc.setStroke(2);
        gc.drawPolygon(lightOrange1);
        gc.drawPolygon(lightOrange2);
        gc.drawPolygon(lightOrange3);
        gc.drawPolygon(lightOrange4);
        gc.drawPolygon(lightOrange5);
        gc.drawPolygon(lightOrange6);
        gc.drawPolygon(lightOrange7);
        gc.drawPolygon(lightOrange8);

        gc.setColor(new Color(239, 193, 96));
        gc.fillPolygon(lightOrange1);
        gc.fillPolygon(lightOrange2);
        gc.fillPolygon(lightOrange3);
        gc.fillPolygon(lightOrange4);
        gc.fillPolygon(lightOrange5);
        gc.fillPolygon(lightOrange6);
        gc.fillPolygon(lightOrange7);
        gc.fillPolygon(lightOrange8);


        //FINAL SWORD WHITE PARTS
        Polygon whitePart1 = new Polygon();
        whitePart1.addPoint(316, 360);
        whitePart1.addPoint(317, 363);
        whitePart1.addPoint(308, 367);
        whitePart1.addPoint(307, 364);

        Polygon whitePart2 = new Polygon();
        whitePart2.addPoint(308, 367);
        whitePart2.addPoint(291, 375);
        whitePart2.addPoint(293, 378);
        whitePart2.addPoint(303, 373);
        whitePart2.addPoint(296, 381);
        whitePart2.addPoint(298, 385);
        whitePart2.addPoint(309, 371);

        gc.setColor(Color.BLACK);
        gc.setStroke(2);
        gc.drawPolygon(whitePart1);
        gc.drawPolygon(whitePart2);

        gc.setColor(new Color(255, 220, 214));
        gc.fillPolygon(whitePart1);
        gc.fillPolygon(whitePart2);


        //PINK THING ABOVE MAIN SWORD
        //OTHER
        gc.setColor(Color.BLACK);
        gc.drawPolygon(darkPinkObject1);
        gc.setColor(new Color(220, 135, 111));
        gc.fillPolygon(darkPinkObject1);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(darkPinkObject2);
        gc.setColor(new Color(220, 135, 111));
        gc.fillPolygon(darkPinkObject2);


        // HANDS

        // POLYGONS
        Polygon lowerRightHand = new Polygon();
        lowerRightHand.addPoint(391, 345);
        lowerRightHand.addPoint(395, 347);
        lowerRightHand.addPoint(405, 348);
        lowerRightHand.addPoint(409, 350);
        lowerRightHand.addPoint(409, 353);
        lowerRightHand.addPoint(406, 356);
        lowerRightHand.addPoint(401, 356);
        lowerRightHand.addPoint(394, 355);
        lowerRightHand.addPoint(380, 360);
        lowerRightHand.addPoint(375, 360);
        lowerRightHand.addPoint(372, 358);
        lowerRightHand.addPoint(365, 358);
        lowerRightHand.addPoint(352, 367);
        lowerRightHand.addPoint(338, 373);
        lowerRightHand.addPoint(335, 366);

        Polygon upperRightHandDARK = new Polygon();
        upperRightHandDARK.addPoint(342, 332);
        upperRightHandDARK.addPoint(352, 336);
        upperRightHandDARK.addPoint(339, 341);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(lowerRightHand);
        gc.setColor(new Color(215, 107, 77));
        gc.fillPolygon(lowerRightHand);
        gc.fillPolygon(upperRightHandDARK);
        gc.setStroke(2);
        gc.drawLine(354, 337, 350, 334);
        gc.drawLine(350, 334, 342, 332);

        Polygon upperRightHandL = new Polygon();
        upperRightHandL.addPoint(350, 324);
        upperRightHandL.addPoint(355, 319);
        upperRightHandL.addPoint(366, 318);
        upperRightHandL.addPoint(371, 322);
        upperRightHandL.addPoint(373, 333);
        upperRightHandL.addPoint(373, 341);
        upperRightHandL.addPoint(368, 342);
        upperRightHandL.addPoint(362, 332);
        upperRightHandL.addPoint(363, 338);
        upperRightHandL.addPoint(363, 345);
        upperRightHandL.addPoint(364, 348);
        upperRightHandL.addPoint(357, 348);
        upperRightHandL.addPoint(354, 338);
        upperRightHandL.addPoint(350, 334);
        upperRightHandL.addPoint(342, 332);
        upperRightHandL.addPoint(346, 324);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(upperRightHandL);
        gc.setColor(new Color(246, 197, 147));
        gc.fillPolygon(upperRightHandL);

        Polygon upperRightHandW = new Polygon();
        upperRightHandW.addPoint(364, 317);
        upperRightHandW.addPoint(372, 310);
        upperRightHandW.addPoint(376, 311);
        upperRightHandW.addPoint(380, 315);
        upperRightHandW.addPoint(380, 323);
        upperRightHandW.addPoint(382, 329);
        upperRightHandW.addPoint(382, 336);
        upperRightHandW.addPoint(379, 336);
        upperRightHandW.addPoint(376, 334);
        upperRightHandW.addPoint(372, 327);
        upperRightHandW.addPoint(371, 322);
        upperRightHandW.addPoint(367, 318);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(upperRightHandW);
        gc.setColor(new Color(246, 209, 165));
        gc.fillPolygon(upperRightHandW);

        Polygon upperRightHandR = new Polygon();
        upperRightHandR.addPoint(376, 311);
        upperRightHandR.addPoint(376, 309);
        upperRightHandR.addPoint(379, 307);
        upperRightHandR.addPoint(384, 307);
        upperRightHandR.addPoint(392, 316);
        upperRightHandR.addPoint(393, 320);
        upperRightHandR.addPoint(389, 323);
        upperRightHandR.addPoint(387, 321);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(upperRightHandR);
        gc.setColor(new Color(246, 209, 165));
        gc.fillPolygon(upperRightHandR);

        gc.setColor(new Color(215, 107, 77));
        gc.setStroke(2);
        gc.drawLine(354, 337, 350, 334);
        gc.drawLine(350, 334, 342, 332);

        Polygon leftHandLight = new Polygon();
        leftHandLight.addPoint(438, 287);
        leftHandLight.addPoint(436, 291);
        leftHandLight.addPoint(428, 293);
        leftHandLight.addPoint(423, 299);
        leftHandLight.addPoint(420, 303);
        leftHandLight.addPoint(416, 307);
        leftHandLight.addPoint(416, 309);
        leftHandLight.addPoint(422, 309);
        leftHandLight.addPoint(428, 318);
        leftHandLight.addPoint(429, 323);
        leftHandLight.addPoint(428, 333);
        leftHandLight.addPoint(423, 335);
        leftHandLight.addPoint(424, 342);
        leftHandLight.addPoint(429, 344);
        leftHandLight.addPoint(434, 344);
        leftHandLight.addPoint(436, 341);
        leftHandLight.addPoint(439, 342);
        leftHandLight.addPoint(446, 339);
        leftHandLight.addPoint(448, 334);
        leftHandLight.addPoint(450, 337);
        leftHandLight.addPoint(457, 333);
        leftHandLight.addPoint(459, 329);
        leftHandLight.addPoint(468, 324);
        leftHandLight.addPoint(471, 315);
        leftHandLight.addPoint(470, 287);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(leftHandLight);
        gc.setColor(new Color(251, 199, 144));
        gc.fillPolygon(leftHandLight);

        Polygon leftHandDark = new Polygon();
        leftHandDark.addPoint(438, 287);
        leftHandDark.addPoint(437, 290);
        leftHandDark.addPoint(451, 293);
        leftHandDark.addPoint(463, 294);
        leftHandDark.addPoint(466, 296);
        leftHandDark.addPoint(466, 309);
        leftHandDark.addPoint(452, 321);
        leftHandDark.addPoint(446, 331);
        leftHandDark.addPoint(439, 333);
        leftHandDark.addPoint(436, 343);
        leftHandDark.addPoint(440, 342);
        leftHandDark.addPoint(446, 339);
        leftHandDark.addPoint(448, 334);
        leftHandDark.addPoint(450, 337);
        leftHandDark.addPoint(457, 333);
        leftHandDark.addPoint(459, 329);
        leftHandDark.addPoint(468, 324);
        leftHandDark.addPoint(471, 315);
        leftHandDark.addPoint(470, 287);

        gc.setColor(new Color(211, 110, 69));
        gc.fillPolygon(leftHandDark);


        // RANDOM BROWN PART (LEFT CAPE UNDER FACE)

        Polygon randomBrownPart = new Polygon();
        randomBrownPart.addPoint(287, 334);
        randomBrownPart.addPoint(269, 332);
        randomBrownPart.addPoint(275, 337);
        randomBrownPart.addPoint(261, 339);
        randomBrownPart.addPoint(279, 340);

        gc.setStroke(1);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(randomBrownPart);
        gc.setColor(new Color(63, 8, 2));
        gc.fillPolygon(randomBrownPart);

        //ALL EXTRA LINES (EXCEPT FOR HAIR)

        gc.setColor(Color.BLACK);
        gc.setStroke(1);

        //HAND OUTLINES
        gc.drawLine(362, 334, 356, 325);
        gc.drawLine(435, 343, 438, 333);
        gc.drawLine(441, 329, 442, 326);
        gc.drawLine(442, 326, 442, 319);
        gc.drawLine(447, 338, 449, 332);
        gc.drawLine(449, 332, 452, 327);
        gc.drawLine(452, 327, 452, 321);
        gc.drawLine(453, 316, 453, 310);
        gc.drawLine(458, 331, 459, 324);
        gc.drawLine(459, 324, 463, 320);
        gc.drawLine(463, 320, 464, 315);
        gc.drawLine(352, 368, 334, 366);

        //SWORD OUTLINES
        gc.drawLine(422, 330, 428, 327);
        gc.drawLine(415, 314, 422, 311);

        gc.drawLine(491, 287, 576, 265);
        gc.drawLine(576, 265, 656, 246);
        gc.drawLine(656, 246, 725, 232);
        gc.drawLine(725, 232, 742, 229);

        gc.drawLine(474, 310, 568, 283);
        gc.drawLine(568, 283, 674, 258);
        gc.drawLine(674, 258, 731, 248);
        gc.drawLine(731, 248, 750, 245);

        // CAPE LEFT SIDE
        gc.setColor(new Color(43, 6, 2, 200));
        gc.drawLine(197, 458, 206, 453);
        gc.drawLine(206, 453, 213, 447);
        gc.drawLine(202, 464, 213, 456);
        gc.drawLine(207, 470, 219, 462);
        gc.drawLine(213, 476, 219, 470);
        gc.drawLine(229, 468, 244, 455);
        gc.drawLine(244, 455, 260, 436);
        gc.drawLine(238, 451, 249, 437);
        gc.drawLine(249, 437, 255, 427);
        gc.drawLine(232, 447, 241, 437);
        gc.drawLine(225, 443, 234, 433);
        gc.drawLine(222, 437, 230, 427);
        gc.drawLine(238, 412, 242, 387);
        gc.drawLine(244, 414, 248, 394);
        gc.drawLine(252, 414, 255, 396);
        gc.drawLine(259, 416, 262, 402);
        gc.drawLine(262, 402, 263, 388);
        gc.drawLine(269, 366, 272, 360);
        gc.drawLine(263, 367, 268, 358);
        gc.drawLine(255, 371, 265, 355);
        gc.drawLine(248, 374, 252, 365);
        gc.drawLine(252, 365, 260, 355);

        // LEFT CAPE UPPER SIDE
        gc.drawLine(224, 373, 247, 346);
        gc.drawLine(247, 346, 260, 339);
        gc.drawLine(260, 339, 280, 340);
        gc.drawLine(280, 340, 287, 334);
        gc.drawLine(298, 333, 304, 328); //EXTRA
        gc.drawLine(287, 334, 304, 328);
        gc.drawLine(304, 328, 318, 325);
        gc.drawLine(318, 325, 327, 329);

        // UPPER CAPE

        gc.setColor(new Color(26, 8, 1, 150));

        gc.drawLine(425, 260, 436, 251);
        gc.drawLine(420, 252, 428, 247);
        gc.drawLine(419, 243, 424, 239);

        gc.drawLine(453, 233, 467, 219);
        gc.drawLine(467, 219, 479, 204);
        gc.drawLine(448, 229, 457, 219);
        gc.drawLine(457, 219, 468, 206);
        gc.drawLine(443, 221, 459, 201);
        gc.drawLine(437, 214, 446, 204);
        gc.drawLine(446, 204, 457, 190);

        gc.drawLine(491, 188, 499, 177);
        gc.drawLine(499, 177, 505, 164);
        gc.drawLine(505, 164, 512, 148);
        gc.drawLine(485, 182, 492, 170);
        gc.drawLine(492, 170, 498, 158);
        gc.drawLine(473, 179, 481, 167);
        gc.drawLine(481, 167, 489, 151);
        gc.drawLine(467, 173, 474, 161);
        gc.drawLine(474, 161, 483, 146);

        gc.drawLine(484, 131, 481, 116);
        gc.drawLine(481, 116, 476, 99);
        gc.drawLine(497, 133, 494, 114);
        gc.drawLine(494, 114, 489, 99);
        gc.drawLine(505, 131, 505, 112);
        gc.drawLine(505, 112, 501, 100);
        gc.drawLine(501, 100, 496, 93);
        gc.drawLine(516, 129, 515, 106);
        gc.drawLine(515, 106, 511, 93);
        gc.drawLine(511, 93, 503, 85);

        gc.drawLine(493, 67, 487, 56);
        gc.drawLine(487, 56, 481, 48);
        gc.drawLine(486, 73, 480, 63);
        gc.drawLine(480, 63, 473, 55);
        gc.drawLine(476, 76, 463, 61);
        gc.drawLine(470, 85, 462, 73);
        gc.drawLine(462, 73, 453, 64);


        // FACE!!!!
        gc.setStroke(1);

        Polygon faceOutline = new Polygon();
        faceOutline.addPoint(274, 302);
        faceOutline.addPoint(279, 317);
        faceOutline.addPoint(266, 327);
        faceOutline.addPoint(261, 327);
        faceOutline.addPoint(260, 332);
        faceOutline.addPoint(252, 338);
        faceOutline.addPoint(249, 343);
        faceOutline.addPoint(245, 344);
        faceOutline.addPoint(241, 338);
        faceOutline.addPoint(229, 337);
        faceOutline.addPoint(226, 274);
        faceOutline.addPoint(239, 278);
        faceOutline.addPoint(247, 282);
        faceOutline.addPoint(264, 292);

        gc.setColor(Color.BLACK);
        gc.drawPolygon(faceOutline);
        gc.setColor(new Color(253, 196, 141));
        gc.fillPolygon(faceOutline);

        Polygon mouth = new Polygon();
        mouth.addPoint(261, 330);
        mouth.addPoint(261, 315);
        mouth.addPoint(256, 324);

        gc.setStroke(2);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(mouth);
        gc.setColor(new Color(255, 221, 190));
        gc.fillPolygon(mouth);
        gc.setStroke(1);
        gc.setColor(Color.BLACK);
        gc.drawLine(259, 322, 259, 317);

        Polygon shadeAboveCollar = new Polygon();
        shadeAboveCollar.addPoint(272, 301);
        shadeAboveCollar.addPoint(271, 293);
        shadeAboveCollar.addPoint(264, 277);
        shadeAboveCollar.addPoint(248, 255);
        shadeAboveCollar.addPoint(243, 255);
        shadeAboveCollar.addPoint(249, 268);
        shadeAboveCollar.addPoint(237, 270);
        shadeAboveCollar.addPoint(239, 278);
        shadeAboveCollar.addPoint(261, 289);

        Polygon shadeOnFace = new Polygon();
        shadeOnFace.addPoint(239, 277);
        shadeOnFace.addPoint(235, 270);
        shadeOnFace.addPoint(230, 265);
        shadeOnFace.addPoint(221, 262);
        shadeOnFace.addPoint(232, 271);
        shadeOnFace.addPoint(229, 274);
        shadeOnFace.addPoint(228, 278);
        shadeOnFace.addPoint(223, 287);
        shadeOnFace.addPoint(222, 293);
        shadeOnFace.addPoint(230, 304);
        shadeOnFace.addPoint(231, 292);
        shadeOnFace.addPoint(234, 283);


        gc.setStroke(1);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(shadeAboveCollar);
        gc.setColor(new Color(211, 118, 77));
        gc.fillPolygon(shadeAboveCollar);
        gc.fillPolygon(shadeOnFace);

        Polygon randomDarkPart = new Polygon();
        randomDarkPart.addPoint(272, 301);
        randomDarkPart.addPoint(271, 293);
        randomDarkPart.addPoint(261, 289);

        gc.setColor(new Color(66, 7, 0));
        gc.fillPolygon(randomDarkPart);

        Polygon faceDarkCircle = new Polygon();
        faceDarkCircle.addPoint(222, 293);
        faceDarkCircle.addPoint(230, 305);
        faceDarkCircle.addPoint(236, 315);
        faceDarkCircle.addPoint(237, 333);
        faceDarkCircle.addPoint(229, 341);
        faceDarkCircle.addPoint(221, 346);
        faceDarkCircle.addPoint(209, 352);
        faceDarkCircle.addPoint(168, 313);

        gc.setStroke(1);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(faceDarkCircle);
        gc.setColor(new Color(126, 47, 16));
        gc.fillPolygon(faceDarkCircle);

        //LINES FOR DARK CIRCLE
        gc.setColor(new Color(111, 29, 0));
        gc.drawLine(218, 292, 236, 317);
        gc.drawLine(214, 292, 236, 321);
        gc.drawLine(210, 292, 236, 325);
        gc.drawLine(206, 292, 236, 329);
        gc.drawLine(202, 292, 236, 333);
        gc.drawLine(198, 292, 233, 336);
        gc.drawLine(194, 292, 231, 338);

        gc.drawLine(190, 292, 229, 341);
        gc.drawLine(186, 292, 226, 344);
        gc.drawLine(182, 292, 223, 347);
        gc.drawLine(178, 292, 220, 349);
        gc.drawLine(174, 292, 217, 349);
        gc.drawLine(170, 292, 214, 349);


        // MAIN HAIR!!!

        Polygon mainHair = new Polygon();
        mainHair.addPoint(217, 359);
        mainHair.addPoint(203, 347);
        mainHair.addPoint(209, 345);
        mainHair.addPoint(203, 335);
        mainHair.addPoint(214, 341);
        mainHair.addPoint(219, 333);
        mainHair.addPoint(203, 322);
        mainHair.addPoint(193, 313);
        mainHair.addPoint(208, 308);
        mainHair.addPoint(208, 302);
        mainHair.addPoint(221, 305);
        mainHair.addPoint(222, 294);
        mainHair.addPoint(224, 287);
        mainHair.addPoint(229, 276);
        mainHair.addPoint(232, 271);
        mainHair.addPoint(221, 262);
        mainHair.addPoint(230, 265);
        mainHair.addPoint(237, 270);
        mainHair.addPoint(248, 268);
        mainHair.addPoint(244, 256);
        mainHair.addPoint(248, 254);
        mainHair.addPoint(256, 246);
        mainHair.addPoint(248, 232);
        mainHair.addPoint(245, 232);
        mainHair.addPoint(245, 229);
        mainHair.addPoint(239, 226);
        mainHair.addPoint(234, 209);
        mainHair.addPoint(228, 214);
        mainHair.addPoint(225, 209);
        mainHair.addPoint(222, 208);
        mainHair.addPoint(222, 206);
        mainHair.addPoint(212, 196);
        mainHair.addPoint(205, 207);
        mainHair.addPoint(198, 203);
        mainHair.addPoint(192, 212);
        mainHair.addPoint(184, 208);
        mainHair.addPoint(170, 208);
        mainHair.addPoint(161, 227);
        mainHair.addPoint(142, 239);
        mainHair.addPoint(139, 248);
        mainHair.addPoint(131, 258);
        mainHair.addPoint(129, 282);
        mainHair.addPoint(124, 301);
        mainHair.addPoint(131, 315);
        mainHair.addPoint(130, 324);
        mainHair.addPoint(144, 353);
        mainHair.addPoint(148, 390);
        mainHair.addPoint(163, 389);
        mainHair.addPoint(164, 378);
        mainHair.addPoint(167, 365);
        mainHair.addPoint(177, 372);
        mainHair.addPoint(187, 381);
        mainHair.addPoint(205, 373);
        mainHair.addPoint(201, 367);
        mainHair.addPoint(208, 363);


        gc.setStroke(1);
        gc.setColor(Color.BLACK);
        gc.drawPolygon(mainHair);
        gc.setColor(new Color(246, 124, 16));
        gc.fillPolygon(mainHair);

        Polygon lighterHair = new Polygon();
        lighterHair.addPoint(164, 223);
        lighterHair.addPoint(176, 223);
        lighterHair.addPoint(191, 233);
        lighterHair.addPoint(188, 238);
        lighterHair.addPoint(205, 255);
        lighterHair.addPoint(196, 259);
        lighterHair.addPoint(201, 270);
        lighterHair.addPoint(211, 275);
        lighterHair.addPoint(200, 276);
        lighterHair.addPoint(204, 286);
        lighterHair.addPoint(203, 297);
        lighterHair.addPoint(194, 302);
        lighterHair.addPoint(197, 311);
        lighterHair.addPoint(192, 313);
        lighterHair.addPoint(201, 322);
        lighterHair.addPoint(195, 333);
        lighterHair.addPoint(175, 337);
        lighterHair.addPoint(185, 351);
        lighterHair.addPoint(195, 350);
        lighterHair.addPoint(182, 360);
        lighterHair.addPoint(190, 367);
        lighterHair.addPoint(178, 373);
        lighterHair.addPoint(167, 364);
        lighterHair.addPoint(164, 377);
        lighterHair.addPoint(148, 379);
        lighterHair.addPoint(144, 353);
        lighterHair.addPoint(130, 324);
        lighterHair.addPoint(131, 315);
        lighterHair.addPoint(124, 301);
        lighterHair.addPoint(129, 282);
        lighterHair.addPoint(131, 258);
        lighterHair.addPoint(139, 248);
        lighterHair.addPoint(142, 239);
        lighterHair.addPoint(161, 227);

        gc.setColor(new Color(245, 160, 17));
        gc.fillPolygon(lighterHair);

        Polygon yellowHairLightest = new Polygon();

        yellowHairLightest.addPoint(142, 239);
        yellowHairLightest.addPoint(161, 227);
        yellowHairLightest.addPoint(164, 223);
        yellowHairLightest.addPoint(176, 223);
        yellowHairLightest.addPoint(191, 233);
        yellowHairLightest.addPoint(188, 238);
        yellowHairLightest.addPoint(205, 255);
        yellowHairLightest.addPoint(196, 259);
        yellowHairLightest.addPoint(201, 270);
        yellowHairLightest.addPoint(211, 275);
        yellowHairLightest.addPoint(200, 276);
        yellowHairLightest.addPoint(204, 286);
        yellowHairLightest.addPoint(203, 297);
        yellowHairLightest.addPoint(194, 302);
        yellowHairLightest.addPoint(197, 311);
        yellowHairLightest.addPoint(192, 313);
        yellowHairLightest.addPoint(201, 322);
        yellowHairLightest.addPoint(195, 333);
        yellowHairLightest.addPoint(175, 337);

        yellowHairLightest.addPoint(163, 327);
        yellowHairLightest.addPoint(165, 313);
        yellowHairLightest.addPoint(167, 302);
        yellowHairLightest.addPoint(169, 285);
        yellowHairLightest.addPoint(166, 271);
        yellowHairLightest.addPoint(156, 250);

        gc.setColor(new Color(255, 255, 65, 50));
        gc.fillPolygon(yellowHairLightest);

        Polygon hairDarkSpot1 = new Polygon();
        hairDarkSpot1.addPoint(159, 326);
        hairDarkSpot1.addPoint(170, 333);
        hairDarkSpot1.addPoint(178, 343);
        hairDarkSpot1.addPoint(167, 336);

        Polygon hairDarkSpot2 = new Polygon();
        hairDarkSpot2.addPoint(186, 314);
        hairDarkSpot2.addPoint(165, 308);
        hairDarkSpot2.addPoint(175, 303);
        hairDarkSpot2.addPoint(160, 304);
        hairDarkSpot2.addPoint(148, 308);
        hairDarkSpot2.addPoint(172, 313);

        Polygon hairDarkSpot3 = new Polygon();
        hairDarkSpot3.addPoint(160, 348);
        hairDarkSpot3.addPoint(149, 331);
        hairDarkSpot3.addPoint(140, 320);
        hairDarkSpot3.addPoint(144, 309);
        hairDarkSpot3.addPoint(146, 288);
        hairDarkSpot3.addPoint(147, 278);
        hairDarkSpot3.addPoint(177, 266);
        hairDarkSpot3.addPoint(155, 266);
        hairDarkSpot3.addPoint(171, 255);
        hairDarkSpot3.addPoint(151, 262);
        hairDarkSpot3.addPoint(146, 271);
        hairDarkSpot3.addPoint(144, 259);
        hairDarkSpot3.addPoint(139, 301);
        hairDarkSpot3.addPoint(131, 287);
        hairDarkSpot3.addPoint(132, 302);
        hairDarkSpot3.addPoint(139, 317);
        hairDarkSpot3.addPoint(137, 331);
        hairDarkSpot3.addPoint(141, 327);

        gc.setColor(new Color(147, 60, 6));
        gc.fillPolygon(hairDarkSpot1);
        gc.fillPolygon(hairDarkSpot2);
        gc.fillPolygon(hairDarkSpot3);


        // LINES FOR HAIR LAYERS

        gc.setStroke(1);
        gc.setColor(Color.BLACK);

        gc.drawLine(171, 222, 177, 208);
        gc.drawLine(184, 209, 176, 223);
        gc.drawLine(176, 223, 162, 241);
        gc.drawLine(162, 241, 158, 249);
        gc.drawLine(171, 243, 185, 228);
        gc.drawLine(185, 228, 196, 215);
        gc.drawLine(191, 211, 219, 230);
        gc.drawLine(219, 230, 208, 239);
        gc.drawLine(205, 206, 198, 216);
        gc.drawLine(207, 222, 222, 208);
        gc.drawLine(214, 225, 229, 213);
        gc.drawLine(223, 228, 236, 218);
        gc.drawLine(226, 234, 239, 225);
        gc.drawLine(226, 245, 245, 232);
        gc.drawLine(231, 250, 251, 238);
        gc.drawLine(245, 258, 240, 250);
        gc.drawLine(240, 250, 224, 252);
        gc.drawLine(245, 258, 235, 258);
        gc.drawLine(235, 258, 227, 260);

        gc.drawLine(206, 222, 198, 230);
        gc.drawLine(198, 230, 211, 242);
        gc.drawLine(198, 230, 193, 230);
        gc.drawLine(193, 230, 181, 248);
        gc.drawLine(181, 248, 174, 255);
        gc.drawLine(174, 255, 154, 265);
        gc.drawLine(154, 265, 171, 266);
        gc.drawLine(171, 266, 185, 263);
        gc.drawLine(202, 234, 187, 252);
        gc.drawLine(197, 252, 211, 241);
        gc.drawLine(211, 241, 218, 241);
        gc.drawLine(218, 241, 225, 257);
        gc.drawLine(225, 257, 214, 258);
        gc.drawLine(221, 262, 206, 254);
        gc.drawLine(206, 254, 173, 267);
        gc.drawLine(173, 267, 146, 278);
        gc.drawLine(146, 278, 147, 288);
        gc.drawLine(147, 288, 160, 283);
        gc.drawLine(160, 283, 180, 283);
        gc.drawLine(180, 283, 192, 276);
        gc.drawLine(192, 276, 228, 275);
        gc.drawLine(224, 269, 214, 275);
        gc.drawLine(219, 264, 193, 273);
        gc.drawLine(214, 259, 197, 264);
        gc.drawLine(197, 264, 191, 268);
        gc.drawLine(191, 268, 178, 271);
        gc.drawLine(228, 275, 233, 278);
        gc.drawLine(233, 278, 228, 277);

        gc.drawLine(226, 281, 208, 281);
        gc.drawLine(223, 287, 204, 287);
        gc.drawLine(221, 295, 200, 293);
        gc.drawLine(208, 301, 205, 297);
        gc.drawLine(205, 297, 192, 302);
        gc.drawLine(192, 302, 175, 303);
        gc.drawLine(167, 307, 180, 312);
        gc.drawLine(180, 312, 193, 313);
        gc.drawLine(178, 342, 184, 351);
        gc.drawLine(184, 351, 192, 347);
        gc.drawLine(192, 347, 185, 334);
        gc.drawLine(192, 347, 203, 347);
        gc.drawLine(194, 335, 202, 347);
        gc.drawLine(195, 351, 200, 355);
        gc.drawLine(200, 355, 207, 362);
        gc.drawLine(200, 367, 190, 358);
        gc.drawLine(190, 358, 182, 353);
        gc.drawLine(200, 367, 195, 372);
        gc.drawLine(199, 375, 176, 355);
        gc.drawLine(176, 355, 160, 348);
        gc.drawLine(156, 342, 160, 348);

        gc.drawLine(193, 379, 177, 364);
        gc.drawLine(167, 365, 159, 354);
        gc.drawLine(158, 376, 158, 390);
        gc.drawLine(153, 378, 153, 389);

        gc.drawLine(167, 307, 175, 303);
        gc.drawLine(220, 369, 232, 344);


        //TEXT

        gc.setColor(Color.BLACK);

        Font firstFont = new Font("Algerian", Font.PLAIN, 50);
        Font secondFont = new Font("Unispace", Font.BOLD, 20);
        gc.setFont(firstFont);
        gc.drawString("DEMON", 73, 60);
        gc.drawString("SLAYER", 60,105);

        gc.setFont(secondFont);
        gc.drawString("ZENITSU", 107,132);


    }
}