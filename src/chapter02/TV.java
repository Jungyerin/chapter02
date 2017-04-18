package chapter02;

public class TV {

	private int channel = 7;
	private int volume = 20;
	private boolean power = false;

	public TV(int ch, int vo, boolean power) {
		this.channel = ch;
		this.volume = vo;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void status() {
		// TODO Auto-generated method stub
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");

	}

	public void power(boolean b) {
		// TODO Auto-generated method stub
		setPower(b);

	}

	public void volume(int i) {
		// TODO Auto-generated method stub
		
		if (i > 100) {
			setVolume(100);
		} else if (i < 0) {
			setVolume(0);
		} else {
			setVolume(i);
		}

	}

	public void volume(boolean b) {
		// TODO Auto-generated method stub
		if (b == true) {
			if (volume + 1 > 100) {
				setVolume(100);
			} else {
				setVolume(volume + 1);
			}
		} else {
			if (volume - 1 < 0) {
				setVolume(0);
			} else {
				setVolume(volume - 1);
			}
		}

	}

	public void channel(int i) {
		// TODO Auto-generated method stub

		if (i > 255) {
			setChannel(1);
		} else if (i < 1) {
			setChannel(255);
		} else {
			setChannel(i);
		}
	}

	public void channel(boolean b) {
		// TODO Auto-generated method stub

		if (b == true) {
			if (channel + 1 > 255) {
				setChannel(1);
			} else {
				setChannel(channel + 1);
			}
		} else {
			if (channel - 1 < 1) {
				setChannel(255);
			} else {
				setChannel(channel - 1);
			}
		}

	}

}
