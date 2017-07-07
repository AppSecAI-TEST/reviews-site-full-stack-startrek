package com.paigeruppel.startrekreviews;

import java.util.Set;

import javax.annotation.Resource;
import javax.persistence.OrderBy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarTrekReviewPopulator implements CommandLineRunner {

	@Resource
	private SeasonRepository tngSeasonRepo;

	@Resource
	private EpisodeRepository tngEpisodeRepo;

	@Resource
	private CharacterRepository characterRepo;

	@Override
	public void run(String... args) throws Exception {

		Character worf = new Character("Lieutenant Commander Worf");
		characterRepo.save(worf);

		Character picard = new Character("Captain Jean Luc Picard");
		characterRepo.save(picard);

		Character riker = new Character("Commander William T. Riker");
		characterRepo.save(riker);

		Character troi = new Character("Counselor Deanna Troi");
		characterRepo.save(troi);

		Character data = new Character("Lieutenant Commander Data");
		characterRepo.save(data);

		Character laforge = new Character("Chief Engineer Geordi La Forge");
		characterRepo.save(laforge);

		Character q = new Character("Q");
		characterRepo.save(q);

		Season one = new Season("1");
		Season two = new Season("2");
		Season three = new Season("3");
		Season four = new Season("4");
		Season five = new Season("5");
		Season six = new Season("6");
		Season seven = new Season("7");

		tngSeasonRepo.save(one);
		tngSeasonRepo.save(two);
		tngSeasonRepo.save(three);
		tngSeasonRepo.save(four);
		tngSeasonRepo.save(five);
		tngSeasonRepo.save(six);
		tngSeasonRepo.save(seven);

		Episode oneOne = new Episode(one, 1, "Encounter at Farpoint",
				"The newly assembled Enterprise crew embarks on the ship's maiden voyage where they are confronted by Q",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
				picard, q);
		oneOne.setImageUrl("/images/episode101.jpg");
		oneOne.setRating(4);
		Episode oneTwo = new Episode(one, 2, "The Naked Now");
		oneTwo.setRating(4);
		Episode oneThree = new Episode(one, 3, "Code of Honor");
		Episode oneFour = new Episode(one, 4, "The Last Outpost");
		Episode oneFive = new Episode(one, 5, "Where No One Has Gone Before");
		Episode oneSix = new Episode(one, 6, "Lonely Among Us");
		Episode oneSeven = new Episode(one, 7, "Justice");
		Episode oneEight = new Episode(one, 8, "The Battle");
		Episode oneNine = new Episode(one, 9, "Hide and Q");
		Episode oneTen = new Episode(one, 10, "Haven");
		Episode oneEleven = new Episode(one, 11, "The Big Goodbye");
		Episode oneTwelve = new Episode(one, 12, "Datalore");
		Episode oneThirteen = new Episode(one, 13, "Angle One");
		Episode oneFourteen = new Episode(one, 14, "11001001");
		Episode oneFifteen = new Episode(one, 15, "Too Short a Season");
		Episode oneSixteen = new Episode(one, 16, "When the Bough Breaks");
		Episode oneSeventeen = new Episode(one, 17, "Home Soil");
		Episode oneEighteen = new Episode(one, 18, "Coming of Age");
		Episode oneNineteen = new Episode(one, 19, "Heart of Glory");
		Episode oneTwenty = new Episode(one, 20, "The Arsenal of Freedom");
		Episode oneTwentyOne = new Episode(one, 21, "Symbiosis");
		tngEpisodeRepo.save(oneOne);
		tngEpisodeRepo.save(oneTwo);
		tngEpisodeRepo.save(oneThree);
		tngEpisodeRepo.save(oneFour);
		tngEpisodeRepo.save(oneFive);
		tngEpisodeRepo.save(oneSix);
		tngEpisodeRepo.save(oneSeven);
		tngEpisodeRepo.save(oneEight);
		tngEpisodeRepo.save(oneNine);
		tngEpisodeRepo.save(oneTen);
		tngEpisodeRepo.save(oneEleven);
		tngEpisodeRepo.save(oneTwelve);
		tngEpisodeRepo.save(oneThirteen);
		tngEpisodeRepo.save(oneFourteen);
		tngEpisodeRepo.save(oneFifteen);
		tngEpisodeRepo.save(oneSixteen);
		tngEpisodeRepo.save(oneSeventeen);
		tngEpisodeRepo.save(oneEighteen);
		tngEpisodeRepo.save(oneNineteen);
		tngEpisodeRepo.save(oneTwenty);
		tngEpisodeRepo.save(oneTwentyOne);

		Episode fiveOne = new Episode(five, 1, "Redemption Part II",
				"The season opener continues a two-part episode focused on a civil war that has broken out within the Klingon Empire. Leuitenant Worf fights on the side of the Gowrons against the Duras clan. Captain Picard and the Enterprise investigate possible Romulan interference in the conflict and must thwart a Romulan ploy to overtake the Vulcan empire. ",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		fiveOne.setImageUrl("/images/episode501.jpg");
		fiveOne.setRating(4);
		Episode fiveTwo = new Episode(five, 2, "Darmok",
				"Picard struggles to bridge a language barrier with an alien captain while re-enacting an ancient battle.",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		fiveTwo.setImageUrl("/images/episode502.jpg");
		fiveTwo.setRating(3);
		tngEpisodeRepo.save(fiveOne);
		tngEpisodeRepo.save(fiveTwo);

	}

}
