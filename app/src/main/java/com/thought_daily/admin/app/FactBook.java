package com.thought_daily.admin.app;

import java.util.Random;

/**
 * Created by Admin on 3/24/2017.
 */

public class FactBook {
    int randomNumber;
    String fact,auth;
    private String[][] mFacts = {

            //09-04-2017
           // Listening
            {"The only way to do great work is to love what you do.", "-Steve Jobs"},
            {"A person who never made a mistake never tried anything new.", "-Albert Einstein"},
            {"Whatever the mind of man can conceive and believe, it can achieve.", "-Napoleon Hill"},
            {"Be the change that you wish to see in the world.","-Mahatma Gandhi"},
            {"Whether you think you can or you think you can’t, you’re right.", "-Henry Ford"},
            {"Remember that not getting what you want is sometimes a wonderful stroke of luck.", "-Dalai Lama"},
            {"Logic will get you from A to B. Imagination will take you everywhere.","-Albert Einstein"},


            {"Wisdom is the reward you get for a lifetime of listening when you'd have preferred to talk.", "-Doug Larson"},
            {"One of the most sincere forms of respect is actually listening to what another has to say." ,"-Bryant H. McGill"},
            {"If you make listening and observation your occupation, you will gain much more than you can by talk.", "-Robert Baden-Powell"},
            {"Most of the successful people I've known are the ones who do more listening than talking.","-Bernard Baruch"},
            {"Listening is being able to be changed by the other person.","-Alan Alda"},
            {"Everything in writing begins with language. Language begins with listening." ,"-Jeanette Winterson"},
            {"There is as much wisdom in listening as there is in speaking and that goes for all relationships, not just romantic ones.","-Daniel Dae Kim"},
            {"The most important thing in communication is hearing what isn't said","-Peter Drucker"},
            {"When people talk, listen completely. Most people never listen.","-Ernest Hemingway"},
            {"Most people do not listen with the intent to understand; they listen with the intent to reply.","-Stephen R. Covey"},
            {"Friends are those rare people who ask how we are, and then wait to hear the answer.","-Ed Cunningham"},
            {"The art of conversation lies in listening.","-Malcom Forbes"},
            {"You cannot truly listen to anyone and do anything else at the same time.","-M. Scott Peck"},
            {"We have two ears and one tongue so that we would listen more and talk less.","-Diogenes"},
            //Storytelling

            {"Stories are a communal currency of humanity.","-Tahir Shah, in Arabian Nights"},
            {"Great stories happen to those who can tell them. ","-Ira Glass"},
            {"The engineers of the future will be poets. ","-Terence McKenna"},
            {"The human species thinks in metaphors and learns through stories.","-Mary Catherine Bateson"},
            {"Sometimes reality is too complex. Stories give it form.","-Jean Luc Godard"},
            {"Story is a yearning meeting an obstacle. ","-Robert Olen Butler"},
            {"If you're going to have a story, have a big story, or none at all. ","-Joseph Campbell"},
            {"Storytelling reveals meaning without committing the error of defining it.","-Hannah Arendt"},
            {"The stories we tell literally make the world. If you want to change the world, you need to change your story. This truth applies both to individuals and institutions.","-Michael Margolis"},
            {"Those who tell the stories rule the world.","-Hopi American Indian Proverb"},
            {"There is no greater agony than bearing an untold story inside you.","-Maya Angelou"},
            {"There's always room for a story that can transport people to another place.","-K. Rowling"},
            //Authenticity

            {"Enlightenment is the key to everything, and it is the key to intimacy, because it is the goal of true authenticity.","-Marianne Willliamson"},
            {"We need to find the courage to say no to the things and people that are not serving us if we want to rediscover ourselves and live our lives with authenticity.","-Barbara de Angelis"},
            {"I know of nothing more valuable, when it comes to the all-important virtue of authenticity, than simply being who you are.","-Charles R. Swindoll"},
            {"The keys to brand success are self-definition, transparency, authenticity and accountability." ,"-Simon Mainwaring"},
            {"Yes, in all my research, the greatest leaders looked inward and were able to tell a good story with authenticity and passion.","-Deepak Chopra"},
            {"Hard times arouse an instinctive desire for authenticity.","-Coco Chanel"},
            {"Always be a first-rate version of yourself and not a second-rate version of someone else.","-Judy Garland"},
            {"Be yourself--not your idea of what you think somebody else's idea of yourself should be.","-Henry David Thoreau"},
            {"Shine with all you have. When someone tries to blow you out, just take their oxygen and burn brighter.","-Katelyn S. Irons"},
            {"Live authentically. Why would you continue to compromise something that's beautiful to create something that is fake?","-Steve Maraboli"},
            {"Authentic brands don't emerge from marketing cubicles or advertising agencies. They emanate from everything the company does.","-Howard Schultz"},
            {"Authenticity requires a certain measure of vulnerability, transparency, and integrity","-Janet Louise Stepenson"},
            {"We have to dare to be ourselves, however frightening or strange that self may prove to be.","-May Sarton"},
            {"I can be a better me than anyone can.","-Diana Ross"},
            //Transparency

            {"There is no persuasiveness more effectual than the transparency of a single heart, of a sincere life.","-Joseph Barber Lightfoot"},
            {"Transparency, honesty, kindness, good stewardship, even humor, work in businesses at all times.","-John Gerzema"},
            {"A lack of transparency results in distrust and a deep sense of insecurity.", "-Dalai Lama"},
            {"I love when things are transparent, free and clear of all inhibition and judgment.","-Pharrell Williams"},
            {"Eyes so transparent that through them the soul is seen.","-Theophile Gautier"},
            {"I wish that every human life might be pure transparent freedom.","-Simone de Beauvoir"},
            {"Truth never damages a cause that is just.","-Mahatma Gandhi"},
            {"He had shown her all the workings of his soul, mistaking this for love.","-E.M. Forster"},
            {"Our whole philosophy is one of transparency.","-Valerie Jarrett"},
            {"A basic tenet of healthy democracy is open dialogue and transparency","-Peter Fenn"},
            {"I just think we need more accountability and more transparency.","-John Thune"},
            {"Honesty is the first chapter in the book of wisdom.","-Thomas Jefferson"},
            //Teamwork
            {"Talent wins games, but teamwork and intelligence wins championships.","-Michael Jordan"},
            {"Alone we can do so little, together we can do so much.","-Helen Keller"},
            {"One of the things I've learned is to be receptive of feedback.","-Ben Silbermann"},
            {"The best way to persuade people is with your ears by listening to them. ","-Dean Rusk"},
            {"Confidence, like art, never comes from having all the answers; it comes from being open to all the questions.","-Earl Gray Stevens"},
            {"Life is 10% what happens to me and 90% how I react.","-John Maxwell"},
            {"The pessimist complains about the wind; the optimist expects it to change; the realist adjusts the sails.","-William Arthur Ward"},
            {"Relax & clear your mind if someone is speaking, so that you're receptive to what they're saying.","-Roger Ailes"},
            {"The most difficult thing is the decision to act, the rest is merely tenacity.","-Emelia Earhart"},
            {"Either you run the day, or they day runs you","-Jim Rohn"},
            //Adaptability
            {"Tactics, fitness, stroke ability, adaptability, experience, and sportsmanship are all necessary for winning.","-Fred Perry"},
            {"It is not the strongest or the most intelligent who will survive but those who can best manage change.","-Charles Darwin"},
            {"Adaptability is about the powerful difference between adapting to cope and adapting to win.","-Max McKeown"},
            {"The art of life is a constant readjustment to our surroundings.","-Kakuzo Okakaura"},
            {"Adaptability is not imitation. It means power of resistance and assimilation.","-Mahatma Gandhi"},
            {"You can't build an adaptable organization without adaptable people- and individuals change only when they have to, or when they want to.","-Gary Hamel"},
            {"All fixed set patterns are incapable of adaptability or pliability. The truth is outside of all fixed patterns.","- Bruce Lee"},

            {"A wise man adapts himself to circumstances, as water shapes itself to the vessel that contains it.","-Chinese Proverb"},
            {"Fall seven times and stand up eight.","-Japanese Proverb"},
            {"When I let go of what I am, I become what I might be.","-Lao Tzu"},
            {"You can't fall if you don't climb. But there's no joy in living your whole life on the ground.","-omkar shinde"},
            //Passion

            {"There is no passion to be found playing small--in settling for a life that is less than the one you are capable of living.","-Nelson Mandela"},
            {"Develop a passion for learning. If you do, you will never cease to grow.","-Anthony J. D'Angelo"},
            {"Passion is energy. Feel the power that comes from focusing on what excites you.","-Oprah Winfrey"},
            {"If passion drives you, let reason hold the reins.","-Benjamin Franklin"},
            {"We must act out passion before we can feel it.","-Jean-Paul Sartre"},
            {"It is obvious that we can no more explain a passion to a person who has never experienced it than we can explain light to the blind.","-T. S. Eliot"},
            {"Nothing is as important as passion. No matter what you want to do with your life, be passionate.","-Jon Bon Jovi"},
            {"You can't fake passion.","-Barbara Corcoran"},
            {"You have to be burning with 'an idea, or a problem, or a wrong that you want to right.' If you're not passionate enough from the start, you'll never stick it out.","- Steve Jobs"},
            {"Yes, in all my research, the greatest leaders looked inward and were able to tell a good story with authenticity and passion.","-Deepak Chopra"},
            {"If you feel like there's something out there that you're supposed to be doing, if you have a passion for it, then stop wishing and just do it.","-Wanda Skyes"},
            {"If you don't love what you do, you won't do it with much conviction or passion.","-Mia Hamm"},
            {"There is no end. There is no beginning. There is only the passion of life. There is no end. There is no beginning. There is only the passion of life.","-Federico Fellini"},
            {"Any guy that's not working with the same amount of intensity and passion that I do, I don't want to know.","-Zakk Wylde"},
            {"It is the soul's duty to be loyal to its own desires. It must abandon itself to its master passion.","-Rebecca West"},
            //Surprise and Delight

            {"The husband who decides to surprise his wife is often very much surprised himself.","-Voltaire"},
            {"Never tell people how to do things. Tell them what to do and they will surprise you with their ingenuity.","-George S. Patton"},

            {"A story to me means a plot where there is some surprise. Because that is how life is--full of surprises."," -Isaac Bashevis Singer"},

            {"Truth is so rare that it is delightful to tell it.","-Emily Dickinson"},

            {"It doesn't take much to surprise others, but to surprise oneself- now that is a great feat.","-Kristen Hartley"},

            {"Surprise yourself every day with your own courage.","-Denholm Elliott"},
            {"To the issues of friendship, love, business and war, 'surprise' is the optimistic solution.","-Amit Kalantri"},
            {"Never tell people how to do things. Tell them what to do and they will surprise you with their ingenuity.","-George S. Patton"},
            {"A story to me means a plot where there is some surprise. Because that is how life is--full of surprises.","-Isaac Bashevis Singer"},
            {"People tend to play in their comfort zone, so the best things are achieved in a state of surprise, actually.","-Brian Eno"},
            //Simplicity

            {"Simplicity is the ultimate sophistication.","-Leonardo da Vinci"},
            {"There is no greatness where there is no simplicity, goodness and truth.","-Leo Tolstoy"},
            {"Manifest plainness, embrace simplicity, reduce selfishness, have few desires.","-Lao Tzu"},
            {"Simplicity and repose are the qualities that measure the true value of any work of art.","-Frank Lloyd Wright"},
            {"Simplicity is the most difficult thing to secure in this world; it is the last limit of experience and the last effort of genius.","-George Sand"},
            {"There is a certain majesty in simplicity which is far above all the quaintness of wit.","-Alexander Pope"},
            {"Simplicity is not the goal. It is the by-product of a good idea and modest expectations.","-Paul Rand"},
            {"Simplicity is prerequisite for reliability.","-Edsger Dijkstra"},
            {"If you haven't done much giving in your life-try it and see how you feel afterwards."," - Moore"},
                                                            //Selling Simplified
            {"If you can't explain it to a six year old, you don't understand it yourself.","-Albert Einstein"},
            {"Life is really simple, but we insist on making it complicated.","- Aristotle"},
                                                            //Simplicity is about subtracting the obvious and adding the meaningful.","- John Maeda"},
            {"Free yourself from the complexities of your life! A life of simplicity and happiness awaits you.","-Steve Maraboli"},
            {"Nature is pleased with simplicity. And nature is no dummy","-Isaac Newton"},
                                                            //Gratefulness

            {"Reflect upon your present blessings--of which every man has many--not on your past misfortunes, of which all men have some.","-Charles Dickens"},
            {"The truest indication of gratitude is to return what you are grateful for.","-Richard Paul Evans"},
            {"I work very hard, and I play very hard. I'm grateful for life. And I live it--I believe life loves the liver of it. I live it.","-Maya Angelou"},
            {"When you are grateful--when you can see what you have--you unlock blessings to flow in your life.","-Suze Orman"},
            {"We must find time to stop and thank the people who make a difference in our lives.","-John F. Kennedy"},
            //{"True forgiveness is when you can say, "Thank you for that experience.","-Oprah Winfrey"},
            {"You can complain because roses have thorns, or you can be grateful that thorn bushes have roses.","-Tom Wilson"},
            {"Do not spoil what you have by desiring what you have not; remember that what you now have was once among the things you only hoped for.","-Epicurus"},
            {"We can only be said to be alive in those moments when our hearts are conscious of our treasures.","-Thornton Wilder"},
            {"As we express our gratitude, we must never forget that the highest appreciation is not to utter words, but to live by them.","-John F. Kennedy"},
            {"Gratitude is not only the greatest of virtues, but the parent of all others.","-Cicero"},
            {"Those who have the ability to be grateful are the ones who have the ability to achieve greatness.","-Steve Maraboli"},
            //Kindness

            {"A warm smile is the universal language of kindness.","-William Arthur Ward"},
            {"Truth is a deep kindness that teaches us to be content in our everyday life and share with the people the same happiness.","-Khalil Gibran"},
            {"Wherever there is a human being, there is an opportunity for a kindness.","-Lucius Annaeus Seneca"},
            {"Treat everyone with respect and kindness. Period. No exceptions.","-Kiana Tom"},
            {"Be kind, for everyone you meet is fighting a harder battle.","-Plato"},
            {"Kindness is a language which the deaf can hear and the blind can see.","-Mark Twain"},
            {"The smallest act of kindness is worth more than the greatest intention.","-Kahlil Gibran"},
            {"I would rather make mistakes in kindness and compassion than work miracles in unkindness and hardness.","-Mother Teresa"},
            {"Never lose a chance of saying a kind word. ","-William Makepeace Thackeray"},
            {"Our kindness may be the most persuasive argument for that which we believe.","-Gordon B. Hinckley"},
            {"It's a little embarrassing that after 45 years of research & study, the best advice I can give people is to be a little kinder to each other.","-Aldous Huxley"},
            //Humility

            {"Never look down on anybody unless you're helping them up.","-Jesse Jackson"},
            {"Humility is not thinking less of yourself, it's thinking of yourself less."," -C. S. Lewis"},
            {"Pride makes us artificial and humility makes us real.","-Thomas Merton"},
            {"The greatest friend of truth is Time, her greatest enemy is Prejudice, and her constant companion is Humility.","-Charles Caleb Colton"},
            {"The proud man can learn humility, but he will be proud of it.","-Mignon McLaughlin"},
            {"Real genius is nothing else but the supernatural virtue of humility in the domain of thought.","-Simone Weil"},
            {"Humility is really important because it keeps you fresh and new.","-Steven Tyler"},
            {"Humility, that low, sweet root, from which all heavenly virtues shoot.","-Thomas Moore"},
            {"Humility is throwing oneself away in complete concentration on something or someone else.","- Madeleine L'Engle"},
            {"Pride must die in you, or nothing of heaven can live in you.","- Andrew Murray, Humility"},
            {"Humility is nothing but truth, and pride is nothing but lying.","- St. Vincent de Paul"},
            {"One cannot be humble and aware of oneself at the same time.","- Madeleine L'Engle"},
            {"Selflessness is humility. Humility and freedom go hand in hand. Only a humble person can be free.","-Jeff Wilson"},
            //Giving

            {"No one has ever become poor by giving."," -Anne Frank"},
            {"A kind gesture can reach a wound that only compassion can heal."," -Steve Maraboli"},
            {"Give, but give until it hurts.","-Mother Teresa"},
            {"As we work to create light for others, we naturally light our own way.","-Mary Anne Radmacher"},
            {"Even the smallest act of caring for another person is like a drop of water -it will make ripples throughout the entire pond..."," -Jessy and Bryan Matteo"},
            {"Don't wait for other people to be loving, giving, compassionate, grateful, forgiving, generous, or friendly... lead the way!","-Steve Maraboli"},
            {"What we spend, we lose. What we keep will be left for others. What we give away will be ours forever.","-David McGee"},
            {"When in doubt as to what you should do, err on the side of giving.","-Tony Cleaver"},
            {"I wish I were like Facebook; being able to 'like' and 'share' everything I get.","-Ashok Kallarakkal"},
            {"Every sunrise is an invitation for us to arise and brighten someone's day.","-Richelle E. Goodrich"},
            //Persistence
            {"Energy and persistence conquer all things.","-Benjamin Franklin"},
            {"Never let your persistence and passion turn into stubbornness and ignorance.","-Anthony J. D'Angelo"},
            {"When I meet successful people I ask 100 questions as to what they attribute their success to. It is usually the same: persistence, hard work and hiring good people.","-Kiana Tom"},
            {"Success is stumbling from failure to failure with no loss of enthusiasm.","-Winston Churchill"},
            {"The best way out is always through.","-Robert Frost"},
            {"Knowing trees, I understand the meaning of patience. Knowing grass, I can appreciate persistence."," -Hal Borland"},
            {"Character consists of what you do on the third and fourth tries.","-James A. Michener"},
            {"If you wish to be out front, then act as if you were behind.","-Lao Tzu"},

            //Inspiration

            {"It is during our darkest moments that we must focus to see the light.","-Aristotle Onassis"},
            {"You never have to change anything you got up in the middle of the night to write.","-Saul Bellow"},
            {"Do you want to know who you are? Don't ask. Act! Action will delineate and define you.","-Thomas Jefferson"},
            {"The best way to predict the future is to invent it.","-Alan Kay"},
            {"I know for sure that what we dwell on is who we become.","-Oprah Winfrey"},
            {"If not us, who? If not now, when?","-Hillel the Elder"},
            {"When the need to succeed is as bad as the need to breathe, then you'll be successful.","-Eric Thomas"},
            {"If you want to test your memory, try to recall what you were worrying about one year ago today.","-E.Joseph Coffman"},
            {"What you do speaks so loudly that I cannot hear what you say.","-Ralph Waldo Emerson"},
            //Life

            {"In three words I can sum up everything I've learned about life: it goes on.","-Robert Frost"},
            {"Life is really simple, but we insist on making it complicated.","-Confucius"},
            {"Go confidently in the direction of your dreams. Live the life you have imagined.","-Henry David Thoreau"},
            {"Only a life lived for others is a life worthwhile.","-Albert Einstein"},
            {"Change is the law of life. And those who look only to the past or present are certain to miss the future.","-John F. Kennedy"},
            {"Life is a succession of lessons which must be lived to be understood.","-Helen Keller"},
            {"The price of anything is the amount of life you exchange for it.","-Henry David Thoreau"},
            {"Life is far too important a thing ever to talk seriously about." ,"-Oscar Wilde"},
            {"Don't let life discourage you; everyone who got where he is had to begin where he was.","-Richard L. Evans"},
            {"The only disability in life is a bad attitude.","-Scott Hamilton"},
            {"Don't let life discourage you; everyone who got where he is had to begin where he was.","-Richard L. Evans"},
            {"Not life, but good life, is to be chiefly valued.","-Socrates"},
            {"main thing is never quit, never quit, never quit.","-William J. Clinton"},
            {"Life in abundance comes only through great love.","-Elbert Hubbard"},
            //Love

            {"Love is not maximum emotion. Love is maximum commitment.","-Sinclair B. Ferguson"},
            {"Although love is communicated in a number of ways,our words often reflect the condition of our heart.","-Jennifer Dion"},
            {"Keep love in your heart. A life without it is like a sunless garden when the flowers are dead.","-Oscar Wilde"},
            {"Sometimes the heart sees what is invisible to the eye.","-H. Jackson Brown, Jr."},
            {"I have decided to stick with love. Hate is too great a burden to bear.","-Martin Luther King, Jr."},
            {"Where there is love there is life.","-Mahatma Gandhi"},
            {"Let us always meet each other with smile, for the smile is the beginning of love.","-Mother Teresa"},
            {"A loving heart is the beginning of all knowledge.","-Thomas Carlyle"},
            {"Love begins at home, and it is not how much we do... but how much love we put in that action." ,"-Mother Teresa"},
            {"A flower cannot blossom without sunshine, and man cannot live without love.","-Max Muller"},
            {"We love life, not because we are used to living but because we are used to loving.","-Friedrich Nietzsche"},
            {"Love yourself first and everything else falls into line. You really have to love yourself to get anything done in this world.","-Lucille Ball"},
            {"Love is a better teacher than duty.","-Albert Einstein"},
            {"The best proof of love is trust.","-Joyce Brothers"},
            {"Love is life. And if you miss love, you miss life.","-Leo Buscaglia"},
            {"Faith makes all things possible... love makes all things easy.","-Dwight L. Moody"},
            //Change

            {"Change is hardest at the beginning, messiest in the middle and best at the end.","-Robin S. Sharma"},
            {"Things change. And friends leave. Life doesn't stop for anybody.","-Stephen Chbosky"},
            {"Never doubt that a small group of thoughtful, committed, citizens can change the world. Indeed, it is the only thing that ever has.","-Margaret Mead"},
            {"Everyone thinks of changing the world, but no one thinks of changing himself.","-Leo Tolstoy"},
            {"Education is the most powerful weapon which you can use to change the world.","-Nelson Mandela"},
            {"Change will not come if we wait for some other person, or if we wait for some other time. We are the ones we've been waiting for. We are the change that we seek.", "-Barack Obama"},
            {"They always say time changes things, but you actually have to change them yourself.","-Andy Warhol"},
            {"Change the way you look at things and the things you look at change.","-Wayne W. Dyer"},
            {"No matter who you are, no matter what you did, no matter where you've come from, you can always change, become a better version of yourself.","-Madonna"},
            {"Those who cannot change their minds cannot change anything."," -saurabh gangamwar"},
            {"I alone cannot change the world, but I can cast a stone across the waters to create many ripples.","-Mother Theresa"},
            {"Change is the end result of all true learning.","-Leo Buscaglia"},
            {"To improve is to change; to be perfect is to change often.","-Winston Churchill"},
            {"Life belongs to the living, and he who lives must be prepared for changes","-Johann Wolfgang von Goethe"},
            {"If you want to change the world, pick up your pen and write.","-Martin Luther"},
            {"A tiny change today brings a dramatically different tomorrow."," -Richard Bach"},
            {"Change your thoughts and you change your world.","-Norman Vincent Peale"},
            //Letting Go

            {"Forgiveness does not change the past, but it does enlarge the future","-Paul Boese"},
            {"The beautiful journey of today can only begin when we learn to let go of yesterday.","-Steve Maraboli"},
            {"Thank God I found the GOOD in goodbye","-Beyonc Knowles"},
            {"The weak can never forgive. Forgiveness is the attribute of the strong.","-Mahatma Gandhi"},
            {"Always forgive your enemies--nothing annoys them so much.","-Oscar Wilde"},
            {"Forgiveness is the fragrance that the violet sheds on the heel that has crushed it.","-Mark Twain"},
            {"When you forgive, you in no way change the past--but you sure do change the future.","-Bernard Meltzer"},
            {"People can be more forgiving than you can imagine. But you have to forgive yourself. Let go of what's bitter and move on.","-Bill Cosby"},
            {"To err is human; to forgive, divine.","-Alexander Pope"},
            {"There is no love without forgiveness, and there is no forgiveness without love.","-Bryant H. McGill"},
            {"Forgiveness is a funny thing. It warms the heart and cools the sting.","-William Arthur Ward"},
            {"It takes one person to forgive, it takes two people to be reunited.","-Lewis B. Smedes"},
            {"Forgiveness is a gift you give yourself.","-Suzanne Somers"},
            {"Without forgiveness, there's no future.","-Desmond Tutu"},
            {"Sooner or later we've all got to let go of our past.","-Dan Brown"},
            {"Yesterday is not ours to recover, but tomorrow is ours to win or lose.","-Lyndon B. Johnson"},
            {"The great courageous act that we must all do, is to have the courage to step out of our history and past so that we can live our dreams.","-Oprah Winfrey"},
            //Family

            {"I've learned through the years that it's not where you live, it's the people who surround you that make you feel at home.","-J.B. McGee"},
            {"The love of family and the admiration of friends is much more important than wealth and privilege.","-Charles Kuralt"},
            {"Family is not an important thing. It's everything.","-Michael J. Fox"},
            {"Family is the most important thing in the world.","-Princess Diana"},
            {"A happy family is but an earlier heaven.","-George Bernard Shaw"},
            {"A man should never neglect his family for business.","-Walt Disney"},
            {"To us, family means putting your arms around each other and being there.","-Barbara Bush"},
            {"Without a family, man, alone in the world, trembles with the cold.","-Andre Maurois"},
            {"Cherish your human connections--your relationships with friends and family.","-Barbara Bush"},
            {"In every conceivable manner, the family is link to our past, bridge to our future.","-Alex Haley"},
            {"The family is one of nature's masterpieces.","-George Santayana"},
            {"The family is the first essential cell of human society.","-Pope John XXIII"},
            {"Family means no one gets left behind or forgotten.","-David Ogden Stiers"},
            {"A man travels the world over in search of what he needs, and returns home to find it.","-George Moore"},
            {"I sustain myself with the love of family.","-Maya Angelou"},
            {"Home is where you are loved the most and act the worst.","-Marjorie Pay Hinckley"},
            {"You are born into your family and your family is born into you. No returns. No exchanges.","-Elizabeth Berg"},
            {"Home is people. Not a place. If you go back there after the people are gone, then all you can see is what is not there any more.","-Robin Hobb"},
            //Strength & Courage

            {"That which does not kill us makes us stronger.","-Friedrich Nietzsche"},
            {"We are only as strong as we are united, as weak as we are divided.","-J.K. Rowling"},
            {"Courage is the most important of all the virtues because without courage, you can't practice any other virtue consistently.","-Maya Angelou"},
            {"A brave man acknowledges the strength of others.","-Veronica Roth"},
            {"Strength does not come from physical capacity. It comes from an indomitable will.","-Mahatma Gandhi"},
            {"It is easier to build strong children than to repair broken men.","-Frederick Douglass"},
            {"With the new day comes new strength and new thoughts.","-Eleanor Roosevelt"},
            {"The world breaks every one and afterward many are strong at the broken places.","-Ernest Hemingway"},
            {"Be strong. Live honorably and with dignity. When you don't think you can, hold on.","-James Frey"},
            {"You feel your strength in the experience of pain.","-Jim Morrison"},
            {"Its not always necessary to be strong, but to feel strong.","-Jon Krakauer"},
            {"We acquire the strength we have overcome.","-Ralph Waldo Emerson"},
            {"Mastering others is strength. Mastering oneself makes you fearless."," -Lao Tzu"},
            {"Shallow men believe in luck. Strong men believe in cause and effect.","-Ralph Waldo Emerson"},
            //Leadership

            {"Leadership is service, not position.","-Tim Fargo"},
            {"A leader is a dealer in hope.","-Napoleon Bonaparte"},
            {"A leader is one who knows the way, goes the way, and shows the way.","-John Maxwell"},
            {"No man will make a great leader who wants to do it all himself, or to get all the credit for doing it.","-Andrew Carnegie"},
            {"As we look ahead into the next century, leaders will be those who empower others.","-Bill Gates"},
            {"A genuine leader is not a searcher for consensus but a molder of consensus.","-Martin Luther King, Jr."},
            {"Effective leadership is not about making speeches or being liked; leadership is defined by results not attributes.","-Peter Drucker"},
            {"Innovation distinguishes between a leader and a follower.","-Steve Jobs"},
            {"Be the chief but never the lord.","-Lao Tzu"},
            {"The speed of the team is the speed of the boss. ","-Barbara Corcoran"},
            {"Leaders think and talk about the solutions. Followers think and talk about the problems.","-Brian Tracy"},
            {"Leadership and learning are indispensable to each other.","-John F. Kennedy"},
            {"To handle yourself, use your head; to handle others, use your heart.","-Eleanor Roosevelt"},
            {"Management is nothing more than motivating other people.","-Lee Iacocca"},
            {"The price of greatness is responsibility.","-Winston Churchill"},
            {"The key to successful leadership today is influence, not authority.","-Kenneth Blanchard"},
            //Legacy

            {"Create with the heart; build with the mind.","-Criss Jami"},
            {"No legacy is so rich as honesty.","-William Shakespeare"},
            {"Carve your name on hearts, not tombstones. A legacy is etched into the minds of others and the stories they share about you.","-Shannon L. Alder"},
            {"If you would not be forgotten as soon as you are dead, either write something worth reading or do something worth writing.","-Benjamin Franklin"},
            {"The things you do for yourself are gone when you are gone, but the things you do for others remain as your legacy.","-Kalu Ndukwe Kalu"},
            {"The only thing you take with you when you're gone is what you leave behind.","-John Allston"},
            {"The greatest use of life is to spend it for something that will outlast it.","-William James"},
            {"You can't leave a footprint that lasts if you're always walking on tiptoe.","-Marion Blakely"},
            //New 10/04/2017
            {"Life isn’t about getting and having, it’s about giving and being.", "-Kevin Kruse"},
            {"Strive not to be a success, but rather to be of value.", "-Albert Einstein"},
            {"Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference.", "-Robert Frost"},
            {"I attribute my success to this: I never gave or took any excuse.", "-Florence Nightingale"},
            {"You miss 100% of the shots you don’t take.", "-Wayne Gretzky"},
            {"The most difficult thing is the decision to act, the rest is merely tenacity.", "-Amelia Earhart"},
            {"Every strike brings me closer to the next home run.", "-Babe Ruth"},
            {"Definiteness of purpose is the starting point of all achievement.", "-W. Clement Stone"},
            {"We must balance conspicuous consumption with conscious capitalism.", "-Kevin Kruse"},
            {"Life is what happens to you while you’re busy making other plans.", "-John Lennon"},
            {"We become what we think about.", "-Earl Nightingale"},
            {"15.Life is 10% what happens to me and 90% of how I react to it.", "-Charles Swindoll"},
            {"The most common way people give up their power is by thinking they don’t have any.", "-Alice Walker"},
            {"The mind is everything. What you think you become.", "-Buddha"},
            {"The best time to plant a tree was 20 years ago. The second best time is now.", "-Chinese Proverb"},
            {"An unexamined life is not worth living.", "-Socrates"},
            {"Eighty percent of success is showing up.", "-Woody Allen"},
            {"Your time is limited, so don’t waste it living someone else’s life.", "-Steve Jobs"},
            {"Winning isn’t everything, but wanting to win is.", "-Vince Lombardi"},
            {"I am not a product of my circumstances. I am a product of my decisions.", "-Stephen Covey"},
            {"Every child is an artist.  The problem is how to remain an artist once he grows up.", "-Pablo Picasso"},
            {"You can never cross the ocean until you have the courage to lose sight of the shore.", "-Christopher Columbus"},
            {"I’ve learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.", "-Maya Angelou"},
            {"Either you run the day, or the day runs you.", "-Jim Rohn"},
            {"The two most important days in your life are the day you are born and the day you find out why.", "-Mark Twain"},
            {"Whatever you can do, or dream you can, begin it.  Boldness has genius, power and magic in it.", "-Johann Wolfgang von Goethe"},
            {"The best revenge is massive success.", "-Frank Sinatra"},
            {"People often say that motivation doesn’t last. Well, neither does bathing.  That’s why we recommend it daily.", "-Zig Ziglar"},
            {"Life shrinks or expands in proportion to one’s courage.", "-Anais Nin"},
            {"If you hear a voice within you say “you cannot paint,” then by all means paint and that voice will be silenced.", "-Vincent Van Gogh"},
            {"There is only one way to avoid criticism: do nothing, say nothing, and be nothing.", "-Aristotle"},
            {"Ask and it will be given to you; search, and you will find; knock and the door will be opened for you.", "-Jesus"},
            {"The only person you are destined to become is the person you decide to be.", "-Ralph Waldo Emerson"},
            {"Go confidently in the direction of your dreams.  Live the life you have imagined.", "-Henry David Thoreau"},
            {"When I stand before God at the end of my life, I would hope that I would not have a single bit of talent left and could say, I used everything you gave me.", "-Erma Bombeck"},
            {"Few things can help an individual more than to place responsibility on him, and to let him know that you trust him.", "-Booker T. Washington"},
            {"Certain things catch your eye, but pursue only those that capture the heart.", "- Ancient Indian Proverb"},
            {"Believe you can and you’re halfway there.", "-Theodore Roosevelt"},
            {"Everything you’ve ever wanted is on the other side of fear.", "-George Addair"},
            {"We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light.", "-Plato"},
            {"Teach thy tongue to say, “I do not know,” and thous shalt progress.", "-Maimonides"},
            {"Start where you are. Use what you have.  Do what you can.", "-Arthur Ashe"},
            {"Fall seven times and stand up eight.", "-Japanese Proverb"},
            {"When one door of happiness closes, another opens, but often we look so long at the closed door that we do not see the one that has been opened for us.", "-Helen Keller"},
            {"Everything has beauty, but not everyone can see.", "-Confucius"},
            {"How wonderful it is that nobody need wait a single moment before starting to improve the world.", "-Anne Frank"},
            {"When I let go of what I am, I become what I might be.", "-Lao Tzu"},
            {"Life is not measured by the number of breaths we take, but by the moments that take our breath away.", "-Maya Angelou"},
            {"Happiness is not something readymade.  It comes from your own actions.", "-Dalai Lama"},
            {"If you’re offered a seat on a rocket ship, don’t ask what seat! Just get on.", "-Sheryl Sandberg"},
            {"If the wind will not serve, take to the oars.", "-Latin Proverb"},
            {"You can’t fall if you don’t climb.  But there’s no joy in living your whole life on the ground.", "-Unknown"},
            {"We must believe that we are gifted for something, and that this thing, at whatever cost, must be attained.", "-Marie Curie"},
            {"Too many of us are not living our dreams because we are living our fears.", "-Les Brown"},
            {"Challenges are what make life interesting and overcoming them is what makes life meaningful.", "-Joshua J. Marine"},
            {"If you want to lift yourself up, lift up someone else.", "-Booker T. Washington"},
            {"I have been impressed with the urgency of doing. Knowing is not enough; we must apply. Being willing is not enough; we must do.", "-Leonardo da Vinci"},
            {"Limitations live only in our minds.  But if we use our imaginations, our possibilities become limitless.", "-Jamie Paolinetti"},
            {"You take your life in your own hands, and what happens? A terrible thing, no one to blame.", "-Erica Jong"},
            {"What’s money? A man is a success if he gets up in the morning and goes to bed at night and in between does what he wants to do.", "-Bob Dylan"},
            {"I didn’t fail the test. I just found 100 ways to do it wrong.", "-Benjamin Franklin"},
            {"In order to succeed, your desire for success should be greater than your fear of failure.", "-Bill Cosby"},
            {"The person who says it cannot be done should not interrupt the person who is doing it.", "-Chinese Proverb"},
            {"There are no traffic jams along the extra mile.", "-Roger Staubach"},
            {"It is never too late to be what you might have been.", "-George Eliot"},
            {"You become what you believe.", "-Oprah Winfrey"},
            {"I would rather die of passion than of boredom.", "-Vincent van Gogh"},
            {"A truly rich man is one whose children run into his arms when his hands are empty.", ""},
            {"It is not what you do for your children, but what you have taught them to do for themselves, that will make them successful human beings.", "-Ann Landers"},
            {"If you want your children to turn out well, spend twice as much time with them, and half as much money.", "-Abigail Van Buren"},
            {"Build your own dreams, or someone else will hire you to build theirs.", "-Farrah Gray"},
            {"The battles that count aren’t the ones for gold medals. The struggles within yourself–the invisible battles inside all of us–that’s where it’s at.", "-Jesse Owens"},
            {"Education costs money.  But then so does ignorance.", "-Sir Claus Moser"},
            {"I have learned over the years that when one’s mind is made up, this diminishes fear.", "-Rosa Parks"},
            {"It does not matter how slowly you go as long as you do not stop.", "-Confucius"},
            {"If you look at what you have in life, you’ll always have more. If you look at what you don’t have in life, you’ll never have enough.", "-Oprah Winfrey"},
            {"You can’t use up creativity.  The more you use, the more you have.", "-Maya Angelou"},
            {"Dream big and dare to fail.", "-Norman Vaughan"},
            {"Our lives begin to end the day we become silent about things that matter.", "-Martin Luther King Jr."},
            {"Do what you can, where you are, with what you have.", "-Teddy Roosevelt"},
            {"If you do what you’ve always done, you’ll get what you’ve always gotten.", "-Tony Robbins"},
            {"Dreaming, after all, is a form of planning.", "-Gloria Steinem"},
            {"It’s your place in the world; it’s your life. Go on and do all you can with it, and make it the life you want to live.", "-Mae Jemison"},
            {"You may be disappointed if you fail, but you are doomed if you don’t try.", "-Beverly Sills"},
            {"Remember no one can make you feel inferior without your consent.", "-Eleanor Roosevelt"},
            {"Life is what we make it, always has been, always will be.", "-Grandma Moses"},
            {"The question isn’t who is going to let me; it’s who is going to stop me.", "-Ayn Rand"},
            {"When everything seems to be going against you, remember that the airplane takes off against the wind, not with it.", "-Henry Ford"},
            {"It’s not the years in your life that count. It’s the life in your years.", "-Abraham Lincoln"},
            {"Change your thoughts and you change your world.", "-Norman Vincent Peale"},
            {"Either write something worth reading or do something worth writing.", "-Benjamin Franklin"},
            {"Nothing is impossible, the word itself says, “I’m possible!”", "-Audrey Hepburn"},
            {"If you can dream it, you can achieve it.", "-Zig Ziglar"}

            };
    public String getFact(int count) {
        fact = mFacts[count][0];
        return fact;
    }
    public String getFactRandom(){
        Random randomGenarator = new Random();
        randomNumber = randomGenarator.nextInt(mFacts.length);
        fact = mFacts[randomNumber][0];
        return fact;
    }
    public String getAuthRandom(){
        auth=mFacts[randomNumber][1];
        //if(auth.equals("")){
           // return "";
        //}else {
        //return "-"+auth;}
        return auth;
    }
    public int maxcount(){
        int arryLength=mFacts.length;
        return arryLength;

    }
    public String getAuth(int count){
        auth = mFacts[count][1];
        //if(auth.equals("")){
         //   return "";
        //}else {
         //   return "-"+auth;}
        return auth;
    }
}
