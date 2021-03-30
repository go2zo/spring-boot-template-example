module.exports = {
  purge: [
    '../src/main/resources/html/**/*.html',
    './src/**/*.html'
  ],
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {},
  },
  variants: {
    extend: {},
  },
  plugins: [
    '@tailwindcss/typography'
  ],
}
