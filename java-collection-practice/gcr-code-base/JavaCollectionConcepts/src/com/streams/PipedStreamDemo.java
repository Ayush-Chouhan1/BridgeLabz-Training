package com.streams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {

	public static void main(String[] args) {

		try {
			// Create piped streams
			PipedInputStream pis = new PipedInputStream();
			PipedOutputStream pos = new PipedOutputStream(pis);

			// Writer thread
			Thread writer = new Thread(() -> {
				try {
					String message = "Hello from Writer Thread!";
					pos.write(message.getBytes());
					pos.close();
				} catch (IOException e) {
					System.out.println("Writer Error: " + e.getMessage());
				}
			});

			// Reader thread
			Thread reader = new Thread(() -> {
				try {
					int data;
					while ((data = pis.read()) != -1) {
						System.out.print((char) data);
					}
					pis.close();
				} catch (IOException e) {
					System.out.println("Reader Error: " + e.getMessage());
				}
			});

			// Start threads
			reader.start();
			writer.start();

		} catch (IOException e) {
			System.out.println("Pipe Connection Error: " + e.getMessage());
		}
	}
}
