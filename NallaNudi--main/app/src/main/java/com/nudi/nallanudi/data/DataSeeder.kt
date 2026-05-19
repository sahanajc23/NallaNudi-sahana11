package com.nudi.nallanudi.data

object DataSeeder {
    fun getWords(): List<Word> = listOf(

        // ── SCIENCE ──────────────────────────────────────────
        Word(englishTerm = "Photosynthesis",
            kannadaTerm = "ದ್ಯುತಿಸಂಶ್ಲೇಷಣೆ",
            explanation = "ಸಸ್ಯಗಳು ಸೂರ್ಯನ ಬೆಳಕನ್ನು ಬಳಸಿ ಆಹಾರ ತಯಾರಿಸುವ ಪ್ರಕ್ರಿಯೆ.",
            example = "ಮರದ ಎಲೆಗಳು ಬೆಳಕಿನಿಂದ ಆಹಾರ ತಯಾರಿಸುತ್ತವೆ.",
            subject = "Science"),

        Word(englishTerm = "Osmosis",
            kannadaTerm = "ಅಂತಃಶ್ರವಣ",
            explanation = "ನೀರು ಕಡಿಮೆ ಸಾಂದ್ರತೆಯಿಂದ ಹೆಚ್ಚು ಸಾಂದ್ರತೆಯ ಕಡೆ ಚಲಿಸುವ ಪ್ರಕ್ರಿಯೆ.",
            example = "ಉಪ್ಪು ನೀರಿನಲ್ಲಿ ಇಟ್ಟ ದ್ರಾಕ್ಷಿ ಒಣಗುತ್ತದೆ.",
            subject = "Science"),

        Word(englishTerm = "Mitochondria",
            kannadaTerm = "ಮೈಟೊಕಾಂಡ್ರಿಯಾ",
            explanation = "ಕೋಶದ ಶಕ್ತಿ ಉತ್ಪಾದಿಸುವ ಅಂಗಾಂಶ. ಇದನ್ನು 'ಕೋಶದ ವಿದ್ಯುತ್ ಕೇಂದ್ರ' ಎಂದು ಕರೆಯುತ್ತಾರೆ.",
            example = "ನಮ್ಮ ದೇಹದ ಪ್ರತಿ ಕೋಶದಲ್ಲಿ ಮೈಟೊಕಾಂಡ್ರಿಯಾ ಇದೆ.",
            subject = "Science"),

        Word(englishTerm = "Evaporation",
            kannadaTerm = "ಆವಿಯಾಗುವಿಕೆ",
            explanation = "ದ್ರವವು ಶಾಖದಿಂದ ಆವಿಯಾಗಿ ಗಾಳಿಯಲ್ಲಿ ಸೇರುವ ಪ್ರಕ್ರಿಯೆ.",
            example = "ಬಿಸಿಲಿನಲ್ಲಿ ಒದ್ದೆ ಬಟ್ಟೆ ಒಣಗುವುದು ಆವಿಯಾಗುವಿಕೆಗೆ ಉದಾಹರಣೆ.",
            subject = "Science"),

        Word(englishTerm = "Gravity",
            kannadaTerm = "ಗುರುತ್ವಾಕರ್ಷಣೆ",
            explanation = "ಭೂಮಿ ವಸ್ತುಗಳನ್ನು ತನ್ನತ್ತ ಸೆಳೆಯುವ ಶಕ್ತಿ.",
            example = "ಮರದಿಂದ ಬಿದ್ದ ಹಣ್ಣು ಕೆಳಗೆ ಬೀಳುತ್ತದೆ.",
            subject = "Science"),

        Word(englishTerm = "Nucleus",
            kannadaTerm = "ಕೋಶ ಕೇಂದ್ರ",
            explanation = "ಕೋಶದ ನಿಯಂತ್ರಣ ಕೇಂದ್ರ. ಇದು ಕೋಶದ ಎಲ್ಲ ಚಟುವಟಿಕೆಗಳನ್ನು ನಿಯಂತ್ರಿಸುತ್ತದೆ.",
            example = "ನ್ಯೂಕ್ಲಿಯಸ್ ಕೋಶದ ಮೆದುಳಿನಂತೆ ಕೆಲಸ ಮಾಡುತ್ತದೆ.",
            subject = "Science"),

        Word(englishTerm = "Friction",
            kannadaTerm = "ಘರ್ಷಣೆ",
            explanation = "ಎರಡು ವಸ್ತುಗಳು ಒಂದರ ಮೇಲೊಂದು ಉಜ್ಜಿದಾಗ ಉಂಟಾಗುವ ವಿರೋಧ ಶಕ್ತಿ.",
            example = "ಬ್ರೇಕ್ ಹಾಕಿದಾಗ ವಾಹನ ನಿಲ್ಲುವುದು ಘರ್ಷಣೆಯಿಂದ.",
            subject = "Science"),

        Word(englishTerm = "Digestion",
            kannadaTerm = "ಜೀರ್ಣಕ್ರಿಯೆ",
            explanation = "ಆಹಾರವನ್ನು ಸಣ್ಣ ಭಾಗಗಳಾಗಿ ಒಡೆದು ದೇಹಕ್ಕೆ ಅವಶ್ಯಕ ಪೋಷಕಾಂಶ ತೆಗೆಯುವ ಪ್ರಕ್ರಿಯೆ.",
            example = "ನಾವು ತಿಂದ ಅನ್ನ ಹೊಟ್ಟೆಯಲ್ಲಿ ಜೀರ್ಣವಾಗುತ್ತದೆ.",
            subject = "Science"),

        Word(englishTerm = "Respiration",
            kannadaTerm = "ಉಸಿರಾಟ",
            explanation = "ಆಮ್ಲಜನಕ ತೆಗೆದುಕೊಂಡು ಇಂಗಾಲದ ಡೈಆಕ್ಸೈಡ್ ಬಿಡುವ ಜೀವ ಪ್ರಕ್ರಿಯೆ.",
            example = "ನಾವು ಪ್ರತಿ ಕ್ಷಣ ಉಸಿರಾಡುತ್ತೇವೆ.",
            subject = "Science"),

        Word(englishTerm = "Chromosome",
            kannadaTerm = "ವರ್ಣತಂತು",
            explanation = "ಜೀವಿಯ ಆನುವಂಶಿಕ ಮಾಹಿತಿ ಹೊಂದಿರುವ ರಚನೆ.",
            example = "ಮನುಷ್ಯನ ಕೋಶದಲ್ಲಿ 46 ವರ್ಣತಂತುಗಳಿವೆ.",
            subject = "Science"),

        // ── MATH ─────────────────────────────────────────────
        Word(englishTerm = "Trigonometry",
            kannadaTerm = "ತ್ರಿಕೋಣಮಿತಿ",
            explanation = "ತ್ರಿಭುಜದ ಬಾಹುಗಳು ಮತ್ತು ಕೋನಗಳ ನಡುವಿನ ಸಂಬಂಧ ಅಧ್ಯಯನ.",
            example = "ಕಟ್ಟಡದ ಎತ್ತರ ಅಳೆಯಲು ತ್ರಿಕೋಣಮಿತಿ ಬಳಸುತ್ತಾರೆ.",
            subject = "Math"),

        Word(englishTerm = "Algebra",
            kannadaTerm = "ಬೀಜಗಣಿತ",
            explanation = "ಅಜ್ಞಾತ ಸಂಖ್ಯೆಗಳನ್ನು ಅಕ್ಷರಗಳಿಂದ ಸೂಚಿಸಿ ಲೆಕ್ಕ ಮಾಡುವ ಗಣಿತ ಶಾಖೆ.",
            example = "x + 5 = 10 ಎಂದರೆ x = 5.",
            subject = "Math"),

        Word(englishTerm = "Hypotenuse",
            kannadaTerm = "ಕರ್ಣ",
            explanation = "ಲಂಬಕೋನ ತ್ರಿಭುಜದಲ್ಲಿ ಲಂಬಕೋನದ ಎದುರಿನ ದೊಡ್ಡ ಬಾಹು.",
            example = "3-4-5 ತ್ರಿಭುಜದಲ್ಲಿ 5 ಕರ್ಣ.",
            subject = "Math"),

        Word(englishTerm = "Denominator",
            kannadaTerm = "ಛೇದ",
            explanation = "ಭಿನ್ನರಾಶಿಯಲ್ಲಿ ಕೆಳಗಿನ ಸಂಖ್ಯೆ. ಒಟ್ಟು ಭಾಗಗಳ ಸಂಖ್ಯೆ ತೋರಿಸುತ್ತದೆ.",
            example = "3/4 ರಲ್ಲಿ 4 ಛೇದ.",
            subject = "Math"),

        Word(englishTerm = "Numerator",
            kannadaTerm = "ಅಂಶ",
            explanation = "ಭಿನ್ನರಾಶಿಯಲ್ಲಿ ಮೇಲಿನ ಸಂಖ್ಯೆ. ತೆಗೆದ ಭಾಗಗಳ ಸಂಖ್ಯೆ ತೋರಿಸುತ್ತದೆ.",
            example = "3/4 ರಲ್ಲಿ 3 ಅಂಶ.",
            subject = "Math"),

        Word(englishTerm = "Perimeter",
            kannadaTerm = "ಪರಿಧಿ",
            explanation = "ಆಕೃತಿಯ ಎಲ್ಲ ಬಾಹುಗಳ ಉದ್ದದ ಮೊತ್ತ.",
            example = "4 ಸೆಂ.ಮೀ ಬಾಹುವಿನ ಚೌಕದ ಪರಿಧಿ = 16 ಸೆಂ.ಮೀ.",
            subject = "Math"),

        Word(englishTerm = "Diameter",
            kannadaTerm = "ವ್ಯಾಸ",
            explanation = "ವೃತ್ತದ ಕೇಂದ್ರದ ಮೂಲಕ ಹಾದು ಹೋಗುವ ಅತಿ ದೊಡ್ಡ ಜ್ಯಾ.",
            example = "ಚಕ್ರದ ಮಧ್ಯದಿಂದ ಅಳೆದ ಅಗಲ ವ್ಯಾಸ.",
            subject = "Math"),

        Word(englishTerm = "Probability",
            kannadaTerm = "ಸಂಭಾವ್ಯತೆ",
            explanation = "ಒಂದು ಘಟನೆ ನಡೆಯುವ ಸಾಧ್ಯತೆಯನ್ನು ಸಂಖ್ಯೆಯಲ್ಲಿ ತೋರಿಸುವ ವಿಧಾನ.",
            example = "ನಾಣ್ಯ ಎಸೆದಾಗ ಹೆಡ್ ಬರುವ ಸಂಭಾವ್ಯತೆ 1/2.",
            subject = "Math"),

        Word(englishTerm = "Coefficient",
            kannadaTerm = "ಗುಣಾಂಕ",
            explanation = "ಬೀಜಗಣಿತದಲ್ಲಿ ಅಕ್ಷರದ ಮುಂದಿನ ಸಂಖ್ಯೆ.",
            example = "3x ನಲ್ಲಿ 3 ಗುಣಾಂಕ.",
            subject = "Math"),

        Word(englishTerm = "Median",
            kannadaTerm = "ಮಧ್ಯಮಾನ",
            explanation = "ಅಂಕಗಳನ್ನು ಕ್ರಮವಾಗಿ ಜೋಡಿಸಿದಾಗ ಮಧ್ಯದಲ್ಲಿ ಬರುವ ಸಂಖ್ಯೆ.",
            example = "1,2,3,4,5 ರಲ್ಲಿ 3 ಮಧ್ಯಮಾನ.",
            subject = "Math"),

        // ── COMMERCE ─────────────────────────────────────────
        Word(englishTerm = "Depreciation",
            kannadaTerm = "ಸವಕಳಿ",
            explanation = "ಸ್ಥಿರಾಸ್ತಿಯ ಬೆಲೆ ಕಾಲಕ್ರಮೇಣ ಕಡಿಮೆಯಾಗುವ ಪ್ರಕ್ರಿಯೆ.",
            example = "ಹೊಸ ಕಾರಿನ ಬೆಲೆ ಪ್ರತಿ ವರ್ಷ ಕಡಿಮೆಯಾಗುತ್ತದೆ.",
            subject = "Commerce"),

        Word(englishTerm = "Liability",
            kannadaTerm = "ಹೊಣೆಗಾರಿಕೆ",
            explanation = "ವ್ಯಾಪಾರಿ ಇತರರಿಗೆ ಕೊಡಬೇಕಾದ ಹಣ ಅಥವಾ ಸೇವೆ.",
            example = "ಬ್ಯಾಂಕ್ ಸಾಲ ಒಂದು ಹೊಣೆಗಾರಿಕೆ.",
            subject = "Commerce"),

        Word(englishTerm = "Asset",
            kannadaTerm = "ಆಸ್ತಿ",
            explanation = "ವ್ಯಾಪಾರಕ್ಕೆ ಆರ್ಥಿಕ ಮೌಲ್ಯ ಹೊಂದಿರುವ ವಸ್ತು ಅಥವಾ ಸಂಪನ್ಮೂಲ.",
            example = "ಕಟ್ಟಡ, ಯಂತ್ರ, ನಗದು ಎಲ್ಲವೂ ಆಸ್ತಿಗಳು.",
            subject = "Commerce"),

        Word(englishTerm = "Dividend",
            kannadaTerm = "ಲಾಭಾಂಶ",
            explanation = "ಕಂಪನಿಯ ಲಾಭದಲ್ಲಿ ಷೇರುದಾರರಿಗೆ ನೀಡುವ ಪಾಲು.",
            example = "ಕಂಪನಿ ಪ್ರತಿ ಷೇರಿಗೆ ₹5 ಲಾಭಾಂಶ ನೀಡಿತು.",
            subject = "Commerce"),

        Word(englishTerm = "Inflation",
            kannadaTerm = "ಹಣದುಬ್ಬರ",
            explanation = "ಸರಕು ಮತ್ತು ಸೇವೆಗಳ ಬೆಲೆ ಸಾಮಾನ್ಯವಾಗಿ ಹೆಚ್ಚಾಗುವ ಸ್ಥಿತಿ.",
            example = "ಕಳೆದ ವರ್ಷ ₹50 ಇದ್ದ ತರಕಾರಿ ಈಗ ₹80 ಆಗಿದೆ.",
            subject = "Commerce"),

        Word(englishTerm = "Audit",
            kannadaTerm = "ಲೆಕ್ಕ ಪರಿಶೋಧನೆ",
            explanation = "ಕಂಪನಿಯ ಆರ್ಥಿಕ ದಾಖಲೆಗಳ ಸ್ವತಂತ್ರ ತಪಾಸಣೆ.",
            example = "ಸರ್ಕಾರಿ ಕಚೇರಿಗಳ ಖರ್ಚಿನ ಆಡಿಟ್ ಮಾಡಲಾಗುತ್ತದೆ.",
            subject = "Commerce"),

        Word(englishTerm = "Revenue",
            kannadaTerm = "ಆದಾಯ",
            explanation = "ವ್ಯಾಪಾರ ಚಟುವಟಿಕೆಗಳಿಂದ ಗಳಿಸಿದ ಒಟ್ಟು ಹಣ.",
            example = "ಅಂಗಡಿಯ ದಿನದ ಮಾರಾಟದ ಮೊತ್ತ ಆದಾಯ.",
            subject = "Commerce"),

        Word(englishTerm = "Expenditure",
            kannadaTerm = "ವೆಚ್ಚ",
            explanation = "ವ್ಯಾಪಾರ ನಡೆಸಲು ಖರ್ಚು ಮಾಡಿದ ಹಣ.",
            example = "ಸಂಬಳ, ಬಾಡಿಗೆ, ವಿದ್ಯುತ್ ಬಿಲ್ ಎಲ್ಲವೂ ವೆಚ್ಚ.",
            subject = "Commerce"),

        Word(englishTerm = "Ledger",
            kannadaTerm = "ಖಾತಾ ಪುಸ್ತಕ",
            explanation = "ಪ್ರತಿಯೊಂದು ವ್ಯವಹಾರದ ವಿವರ ದಾಖಲಿಸುವ ಮುಖ್ಯ ಪುಸ್ತಕ.",
            example = "ಅಂಗಡಿಯವರು ಖರೀದಿ ಮತ್ತು ಮಾರಾಟ ಖಾತಾ ಪುಸ್ತಕದಲ್ಲಿ ಬರೆಯುತ್ತಾರೆ.",
            subject = "Commerce"),

        Word(englishTerm = "Entrepreneur",
            kannadaTerm = "ಉದ್ಯಮಿ",
            explanation = "ಹೊಸ ವ್ಯಾಪಾರ ಆರಂಭಿಸಿ ಅಪಾಯ ತೆಗೆದುಕೊಳ್ಳುವ ವ್ಯಕ್ತಿ.",
            example = "ಹೊಸ ಕಂಪನಿ ಕಟ್ಟಿದ ವ್ಯಕ್ತಿ ಉದ್ಯಮಿ.",
            subject = "Commerce")
    )
}