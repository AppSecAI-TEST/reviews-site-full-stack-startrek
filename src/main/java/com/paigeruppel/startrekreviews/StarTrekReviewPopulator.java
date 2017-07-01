package com.paigeruppel.startrekreviews;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StarTrekReviewPopulator implements CommandLineRunner {

	@Resource
	private SeasonRepository tngSeasonRepo;

	@Resource
	private EpisodeRepository tngEpisodeRepo;

	@Override
	public void run(String... args) throws Exception {
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

		Episode oneOne = new Episode(one, "1", "Encounter at Farpoint",
				"The newly assembled Enterprise crew embarks on the ship's maiden voyage where they are confronted by Q",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		oneOne.setImageUrl("/images/episode101.jpg");
		Episode oneTwo = new Episode(one, "2", "The Naked Now", "Lorem ipsum blah blah blah",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		tngEpisodeRepo.save(oneOne);
		tngEpisodeRepo.save(oneTwo);

		Episode fiveOne = new Episode(five, "1", "Redemption Part II",
				"The season opener continues a two-part episode focused on a civil war that has broken out within the Klingon Empire. Leuitenant Worf fights on the side of the Gowrons against the Duras clan. Captain Picard and the Enterprise investigate possible Romulan interference in the conflict and must thwart a Romulan ploy to overtake the Vulcan empire. ",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		fiveOne.setImageUrl("/images/episode501.jpg");
		fiveOne.setRating(4);
		Episode fiveTwo = new Episode(five, "02", "Darmok",
				"Picard struggles to bridge a language barrier with an alien captain while re-enacting an ancient battle.",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		fiveTwo.setImageUrl("/images/episode502.jpg");
		fiveTwo.setRating(3);
		tngEpisodeRepo.save(fiveOne);
		tngEpisodeRepo.save(fiveTwo);

	}

}
