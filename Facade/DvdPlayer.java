/// <summary>
    /// класс для работы с DVD проигрывателем
    /// </summary>
    class DvdPlayer
    {
        private string description;
        private int currentTrack;
        private Amplifier amplifier;
        private string movie;

        /// <summary>
        /// Initializes a new instance of the <see cref="DvdPlayer"/> class.
        /// </summary>
        /// <param name="description">The description.</param>
        /// <param name="amplifier">The amplifier.</param>
        public DvdPlayer(string description, Amplifier amplifier)
        {
            this.description = description;
            this.amplifier = amplifier;
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
        /// Ejects this instance.
        /// </summary>
        public void eject()
        {
            Console.WriteLine(description + " eject");
        }

        /// <summary>
        /// Plays the specified movie.
        /// </summary>
        /// <param name="movie">The movie.</param>
        public void play(string movie)
        {
            Console.WriteLine(description + " playing \"" + movie + "\"");
        }

        /// <summary>
        /// Plays the specified track.
        /// </summary>
        /// <param name="track">The track.</param>
        public void play(int track)
        {
            if (movie == null)
            {
                Console.WriteLine(description + " can't play track " + track + " no dvd inserted");
            }
            else
            {
                currentTrack = track;
                Console.WriteLine(description + " playing track " + currentTrack + " of \"" + movie + "\"");
            }
        }

        /// <summary>
        /// Stops this instance.
        /// </summary>
        public void stop()
        {
            currentTrack = 0;
            Console.WriteLine(description + " stopped \"" + movie + "\"");
        }

        /// <summary>
        /// Pauses this instance.
        /// </summary>
        public void pause()
        {
            Console.WriteLine(description + " paused \"" + movie + "\"");
        }

        /// <summary>
        /// Sets the two channel audio.
        /// </summary>
        public void setTwoChannelAudio()
        {
            Console.WriteLine(description + " set two channel audio");
        }

        /// <summary>
        /// Sets the surround audio.
        /// </summary>
        public void setSurroundAudio()
        {
            Console.WriteLine(description + " set surround audio");
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
