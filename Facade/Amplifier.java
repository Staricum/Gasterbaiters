/// <summary>
    /// класс для работы с усилителем
    /// </summary>
    class Amplifier
    {
        private string description;
        private Tuner tuner;
        private DvdPlayer dvd;
        private CdPlayer cd;

        /// <summary>
        /// Initializes a new instance of the <see cref="Amplifier"/> class.
        /// </summary>
        /// <param name="description">The description.</param>
        public Amplifier(string description)
        {
            this.description = description;
        }

        /// <summary>
        /// Ons this instance.
        /// </summary>
        public void on()
        {
            Console.WriteLine(description + " on");
        }

        /// <summary>
        /// Offs this instance.
        /// </summary>
        public void off()
        {
            Console.WriteLine(description + " off");
        }

        /// <summary>
        /// Sets the stereo sound.
        /// </summary>
        public void setStereoSound()
        {
            Console.WriteLine(description + " stereo mode on");
        }

        /// <summary>
        /// Sets the surround sound.
        /// </summary>
        public void setSurroundSound()
        {
            Console.WriteLine(description + " surround sound on (5 speakers, 1 subwoofer)");
        }

        /// <summary>
        /// Sets the volume.
        /// </summary>
        /// <param name="level">The level.</param>
        public void setVolume(int level)
        {
            Console.WriteLine(description + " setting volume to " + level);
        }

        /// <summary>
        /// Sets the tuner.
        /// </summary>
        /// <param name="tuner">The tuner.</param>
        public void setTuner(Tuner tuner)
        {
            Console.WriteLine(description + " setting tuner to " + tuner);
            this.tuner = tuner;
        }

        /// <summary>
        /// Sets the DVD.
        /// </summary>
        /// <param name="dvd">The DVD.</param>
        public void setDvd(DvdPlayer dvd)
        {
            Console.WriteLine(description + " setting DVD player to " + dvd);
        }

        /// <summary>
        /// Sets the cd.
        /// </summary>
        /// <param name="cd">The cd.</param>
        public void setCd(CdPlayer cd)
        {
            Console.WriteLine(description + " setting CD player to " + cd);
        }

        /// <summary>
        /// Converts to string.
        /// </summary>
        /// <returns>
        /// A <see cref="System.String" /> that represents this instance.
        /// </returns>
        public override string ToString()
        {
            return description;
        }
}

