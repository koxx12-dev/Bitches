@echo off
setlocal enabledelayedexpansion

call :defaultVariables

:: test for lunar, feather, and badlion
if exist "%appdata%\lunarclient" (
    set hasLunar=true
) else (
    if exist "C:\Users\%username%\.lunarclient" (
        set hasLunar=true
    )
)
if exist "%appdata%\.feather" (
    set hasFeather=true
)
if exist "C:\Program Files\Badlion Client" (
    set hasBLC=true
)

set /a bitchAmount=%random% * 100 / 32768 + 1
set loopnum=0

:loop
set /a loopnum+=1
:: non-specialty bitches
set /a bitchDecider=%random% * 399 / 32768 + 100
:: slightly better random stuff
set /a loopnumModTwo = %loopnum% %% 2
if %loopnumModTwo% == 1 set /a bitchDecider=%random% * 395 / 32768 + 100
:: deciding which bitch to give
if %bitchDecider:~0,1% == 1 (
    :: kitten
    call :makeBitch kitten "does what they're told" "uses twitter" "is fatherless"
    goto endOfBitchGen
)
if %bitchDecider:~0,1% == 2 (
    :: generic
    set /a genericBitchDecider=!random! * 4 / 32768 + 0
    if !genericBitchDecider! == 1 (
        if %hasLunar% == true (
            :: ctt
            call :makeBitch CTT "uses fog in their videos" "gets pegged by Woofina" "has a shitty mic"
            goto endOfBitchGen
        )
    )
    if !genericBitchDecider! == 2 (
        if %hasFeather% == true (
            :: cyber
            call :makeBitch cyber "brought forge" "has a prebuilt pc" "is gay"
            goto endOfBitchGen
        )
    )
    if !genericBitchDecider! == 3 (
        if %hasBLC% == true (
            :: annoying
            call :makeBitch annoying "is fatheless" "pregnant" "annoying" "transgender"
            goto endOfBitchGen
        )
    )
    call :makeBitch standard
    goto endOfBitchGen
)
if %bitchDecider:~0,1% == 3 (
    :: emo
    call :makeBitch emo "wears black clothes"
    goto endOfBitchGen
)
if %bitchDecider:~0,1% == 4 (
    :: waifu
    call :makeBitch waifu "is wife material" "likes Akame Ga Kill"
    goto endOfBitchGen
)
:endOfBitchGen
echo %bitch%
if %loopnum% lss %bitchAmount% goto loop
pause
exit

:: ###############################
:: functions
:: ###############################

:defaultVariables
set hasLunar=false
set hasFeather=false
set hasBLC=false
goto :eof

:makeBitch
set /a age=%random% * 30 / 32768 + 18
set params=0
set "name="
call :getRace
call :getGender
call :getName
for %%a in (%*) do (
    set /a params+=1
)
if %params% == 1 (
    set "bitch=[90mThis [0m%~1[90m bitch, named [0m%name%[90m, is [0m%age%[90m years old, [0m%race%[90m, and [0m%gender%[90m.[0m"
)
if %params% == 2 (
    set "bitch=[90mThis [0m%~1[90m bitch, named [0m%name%[90m, is [0m%age%[90m years old, [0m%race%[90m, and [0m%gender%[90m. And this bitch [0m%~2[90m.[0m"
)
if %params% == 3 (
    set "bitch=[90mThis [0m%~1[90m bitch, named [0m%name%[90m, is [0m%age%[90m years old, [0m%race%[90m, and [0m%gender%[90m. And this bitch [0m%~2[90m and [0m%~3[90m.[0m"
)
if %params% == 4 (
    set "bitch=[90mThis [0m%~1[90m bitch, named [0m%name%[90m, is [0m%age%[90m years old, [0m%race%[90m, and [0m%gender%[90m. And this bitch [0m%~2[90m, [0m%~3[90m, and [0m%~4[90m.[0m"
)
if %params% == 5 (
    set "bitch=[90mThis [0m%~1[90m bitch, named [0m%name%[90m, is [0m%age%[90m years old, [0m%race%[90m, and [0m%gender%[90m. And this bitch [0m%~2[90m, [0m%~3[90m, [0m%~4[90m, and [0m%~5[90m.[0m"
)
if %params% == 6 (
    set "bitch=[90mThis [0m%~1[90m bitch, named [0m%name%[90m, is [0m%age%[90m years old, [0m%race%[90m, and [0m%gender%[90m. And this bitch [0m%~2[90m, [0m%~3[90m, [0m%~4[90m, [0m%~5[90m, and [0m%~6[90m.[0m"
)
goto :eof

:getGender
set /a genderDecider=%random% * 3 / 32768 + 0
if %genderDecider% == 0 set "gender=male"
if %genderDecider% == 1 set "gender=female"
if %genderDecider% == 2 set "gender=non-binary"
goto :eof

:getRace
set /a raceDecider=%random% * 4 / 32768 + 0
if %raceDecider% == 0 set race=African
if %raceDecider% == 1 set race=Asian
if %raceDecider% == 2 set race=Causcasian
if %raceDecider% == 3 set race=Hispanic
goto :eof

:getName
if not defined name1 call :setNames
set /a nameDecider=%random% * 420 / 32768 + 1
set name=!name%nameDecider%!
goto :eof

:setNames
set name1=Christopher
set name2=Jessica
set name3=Matthew
set name4=Ashley
set name5=Jennifer
set name6=Joshua
set name7=Amanda
set name8=Daniel
set name9=David
set name10=James
set name11=Robert
set name12=John
set name13=Andrew
set name14=Ryan
set name15=Brandon
set name16=Jason
set name17=Justin
set name18=Joseph
set name19=Sarah
set name20=William
set name21=Jonathan
set name22=Stephanie
set name23=Brian
set name24=Nicole
set name25=Nicholas
set name26=Anthony
set name27=Heather
set name28=Eric
set name29=Elizabeth
set name30=Adam
set name31=Megan
set name32=Melissa
set name33=Kevin
set name34=Steven
set name35=Thomas
set name36=Timothy
set name37=Christina
set name38=Kyle
set name39=Rachel
set name40=Laura
set name41=Lauren
set name42=Amber
set name43=Brittany
set name44=Danielle
set name45=Richard
set name46=Kimberly
set name47=Jeffrey
set name48=Amy
set name49=Crystal
set name50=Michelle
set name51=Tiffany
set name52=Jeremy
set name53=Benjamin
set name54=Mark
set name55=Emily
set name56=Aaron
set name57=Charles
set name58=Rebecca
set name59=Jacob
set name60=Stephen
set name61=Patrick
set name62=Sean
set name63=Erin
set name64=Zachary
set name65=Jamie
set name66=Kelly
set name67=Samantha
set name68=Nathan
set name69=Sara
set name70=Dustin
set name71=Paul
set name72=Angela
set name73=Tyler
set name74=Scott
set name75=Katherine
set name76=Andrea
set name77=Gregory
set name78=Erica
set name79=Mary
set name80=Travis
set name81=Lisa
set name82=Kenneth
set name83=Bryan
set name84=Lindsey
set name85=Kristen
set name86=Jose
set name87=Alexander
set name88=Jesse
set name89=Katie
set name90=Lindsay
set name91=Shannon
set name92=Vanessa
set name93=Courtney
set name94=Christine
set name95=Alicia
set name96=Cody
set name97=Allison
set name98=Bradley
set name99=Samuel
set name100=Shawn
set name101=April
set name102=Derek
set name103=Kathryn
set name104=Kristin
set name105=Chad
set name106=Jenna
set name107=Tara
set name108=Maria
set name109=Krystal
set name110=Jared
set name111=Anna
set name112=Edward
set name113=Julie
set name114=Peter
set name115=Holly
set name116=Marcus
set name117=Kristina
set name118=Natalie
set name119=Jordan
set name120=Victoria
set name121=Jacqueline
set name122=Corey
set name123=Keith
set name124=Monica
set name125=Juan
set name126=Donald
set name127=Cassandra
set name128=Meghan
set name129=Joel
set name130=Shane
set name131=Phillip
set name132=Patricia
set name133=Brett
set name134=Ronald
set name135=Catherine
set name136=George
set name137=Antonio
set name138=Cynthia
set name139=Stacy
set name140=Kathleen
set name141=Raymond
set name142=Carlos
set name143=Brandi
set name144=Douglas
set name145=Nathaniel
set name146=Ian
set name147=Craig
set name148=Brandy
set name149=Alex
set name150=Valerie
set name151=Veronica
set name152=Cory
set name153=Whitney
set name154=Gary
set name155=Derrick
set name156=Philip
set name157=Luis
set name158=Diana
set name159=Chelsea
set name160=Leslie
set name161=Caitlin
set name162=Leah
set name163=Natasha
set name164=Erika
set name166=Casey
set name167=Latoya
set name168=Erik
set name169=Dana
set name170=Victor
set name171=Brent
set name172=Dominique
set name173=Frank
set name174=Brittney
set name175=Evan
set name176=Gabriel
set name177=Julia
set name178=Candice
set name179=Karen
set name180=Melanie
set name181=Adrian
set name182=Stacey
set name183=Margaret
set name184=Sheena
set name185=Wesley
set name186=Vincent
set name187=Alexandra
set name188=Katrina
set name189=Bethany
set name190=Nichole
set name191=Larry
set name192=Jeffery
set name193=Curtis
set name194=Carrie
set name195=Todd
set name196=Blake
set name197=Christian
set name198=Randy
set name199=Dennis
set name200=Alison
set name201=Trevor
set name202=Seth
set name203=Kara
set name204=Joanna
set name205=Rachael
set name206=Luke
set name207=Felicia
set name208=Brooke
set name209=Austin
set name210=Candace
set name211=Jasmine
set name212=Jesus
set name213=Alan
set name214=Susan
set name215=Sandra
set name216=Tracy
set name217=Kayla
set name218=Nancy
set name219=Tina
set name220=Krystle
set name221=Russell
set name222=Jeremiah
set name223=Carl
set name224=Miguel
set name225=Tony
set name226=Alexis
set name227=Gina
set name228=Jillian
set name229=Pamela
set name230=Mitchell
set name231=Hannah
set name232=Renee
set name233=Denise
set name234=Molly
set name235=Jerry
set name236=Misty
set name237=Mario
set name238=Johnathan
set name239=Jaclyn
set name240=Brenda
set name241=Terry
set name242=Lacey
set name243=Shaun
set name244=Devin
set name245=Heidi
set name246=Troy
set name247=Lucas
set name248=Michael
set name249=Jorge
set name250=Andre
set name251=Morgan
set name252=Drew
set name253=Sabrina
set name254=Miranda
set name255=Alyssa
set name256=Alisha
set name257=Teresa
set name258=Johnny
set name259=Meagan
set name260=Allen
set name261=Krista
set name262=Marc
set name263=Tabitha
set name264=Lance
set name265=Ricardo
set name266=Martin
set name267=Chase
set name268=Theresa
set name269=Melinda
set name270=Monique
set name271=Tanya
set name272=Linda
set name273=Kristopher
set name274=Bobby
set name275=Caleb
set name276=Ashlee
set name277=Kelli
set name278=Henry
set name279=Garrett
set name280=Mallory
set name281=Jill
set name282=Jonathon
set name283=Kristy
set name284=Anne
set name285=Francisco
set name286=Danny
set name287=Robin
set name288=Lee
set name289=Tamara
set name290=Manuel
set name291=Meredith
set name292=Colleen
set name293=Lawrence
set name294=Christy
set name295=Ricky
set name296=Randall
set name297=Marissa
set name298=Ross
set name299=Mathew
set name300=Jimmy
set name301=Abigail
set name302=Kendra
set name303=Carolyn
set name304=Billy
set name305=Deanna
set name306=Jenny
set name307=Jon
set name308=Albert
set name309=Taylor
set name310=Lori
set name311=Rebekah
set name312=Cameron
set name313=Ebony
set name314=Wendy
set name315=Angel
set name316=Micheal
set name317=Kristi
set name318=Caroline
set name319=Colin
set name320=Dawn
set name321=Kari
set name322=Clayton
set name323=Arthur
set name324=Roger
set name325=Roberto
set name326=Priscilla
set name327=Darren
set name328=Kelsey
set name329=Clinton
set name330=Walter
set name331=Louis
set name332=Barbara
set name333=Isaac
set name334=Cassie
set name335=Grant
set name336=Cristina
set name337=Tonya
set name338=Rodney
set name339=Bridget
set name340=Joe
set name341=Cindy
set name342=Oscar
set name343=Willie
set name344=Maurice
set name345=Jaime
set name346=Angelica
set name347=Sharon
set name348=Julian
set name349=Jack
set name350=Jay
set name351=Calvin
set name352=Marie
set name353=Hector
set name354=Kate
set name355=Adrienne
set name356=Tasha
set name357=Michele
set name358=Ana
set name359=Stefanie
set name360=Cara
set name361=Alejandro
set name362=Ruben
set name363=Gerald
set name364=Audrey
set name365=Kristine
set name366=Ann
set name367=Shana
set name368=Javier
set name369=Katelyn
set name370=Brianna
set name371=Bruce
set name372=Deborah
set name373=Claudia
set name374=Carla
set name375=Wayne
set name376=Roy
set name377=Virginia
set name378=Haley
set name379=Brendan
set name380=Janelle
set name381=Jacquelyn
set name382=Beth
set name383=Edwin
set name384=Dylan
set name385=Dominic
set name386=Latasha
set name387=Darrell
set name388=Geoffrey
set name389=Savannah
set name390=Reginald
set name391=Carly
set name392=Fernando
set name393=Ashleigh
set name394=Aimee
set name395=Regina
set name396=Mandy
set name397=Sergio
set name398=Rafael
set name399=Pedro
set name400=Janet
set name401=Kaitlin
set name402=Frederick
set name403=Cheryl
set name404=Autumn
set name405=Tyrone
set name406=Martha
set name407=Omar
set name408=Lydia
set name409=Jerome
set name410=Theodore
set name411=Abby
set name412=Neil
set name413=Shawna
set name414=Sierra
set name415=Nina
set name416=Tammy
set name417=Nikki
set name418=Terrance
set name419=Donna
set name420=Claire
goto :eof