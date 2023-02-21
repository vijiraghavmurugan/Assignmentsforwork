package snakenladder;

public class Snake {

	private int startPosition;
	private int endPosition;

	public int getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(int endPosition) {
		this.endPosition = endPosition;
	}

	public Snake(int startPosition, int endPosition) {
		super();
		this.startPosition = startPosition;
		this.endPosition = endPosition;
	}

	public Snake(int newPosition) {
		this.startPosition = newPosition;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass())
			return false;
		Snake s1 = (Snake) obj;

		return this.startPosition == s1.startPosition;
	}

}
