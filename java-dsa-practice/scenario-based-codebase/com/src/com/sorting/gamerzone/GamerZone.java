package com.sorting.gamerzone;

public class GamerZone {

	// Quick Sort method
	public static void quickSort(Player[] players, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(players, low, high);

			quickSort(players, low, pivotIndex - 1);
			quickSort(players, pivotIndex + 1, high);
		}
	}

	private static int partition(Player[] players, int low, int high) {

		Player pivot = players[high];
		int i = low - 1;

		// Rearrange elements based on pivot score
		for (int j = low; j < high; j++) {
			if (players[j].score > pivot.score) {
				i++;
				Player temp = players[i];
				players[i] = players[j];
				players[j] = temp;
			}
		}

		Player temp = players[i + 1];
		players[i + 1] = players[high];
		players[high] = temp;

		return i + 1;
	}

	// Display leaderboard
	public static void displayLeaderboard(Player[] players) {
		int rank = 1;
		for (Player p : players) {
			System.out.println(rank++ + ". " + p.name + " Score: " + p.score);
		}
	}

	// Driver method
	public static void main(String[] args) {

		Player[] players = { new Player(201, "RogueX", 8700), new Player(202, "Shadow", 12500),
				new Player(203, "Blaze", 9400), new Player(204, "Nova", 15000), new Player(205, "Viper", 11000) };

		// Sort players by score
		quickSort(players, 0, players.length - 1);

		// Display ranked leaderboard
		displayLeaderboard(players);
	}
}
