|                           |                                          |                                                                                                                                                   |                                                                  |                                                                  |                                                                                                                                              |
|---------------------------|------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| [Home](../index.html) \|  | [Java](../BiQuadDesigner/index.html) \|  | BiQuadDesigner FFTExplorer HDTV Test Pattern JDBClient JNX JSQLiteClient JSigGen JTides Home Page JWX MagicLantern OpticalRayTracer PLCalc PLCash | [<img src="../images/leftarrow.png" title="Click for prior page" 
                                                                                                                                                                                                                            data-border="0" />](../FFTExplorer/index.html)                    | [<img src="../images/rightarrow.png" title="Click for next page" 
                                                                                                                                                                                                                                                                                               data-border="0" />](../JDBClient/index.html)                      |  [<img src="../images/addthis16.gif" style="border:0px;" />  Share This Page](../administration/submit.php "Recommend this page to friends") |

<div align="center">

<div class="article_title_inverse">

HDTV Test Pattern

</div>

<div class="article_linklist_inverse">

*A resource for configuring flat-panel video displays*

— [P. Lutus](../administration/index.html "Click for biography") —
[Message Page](../messages) —

Copyright © 2014, [P.
Lutus](../administration/index.html "Click for biography")

Version 2.0 (08.30.2014)

(double-click any word to see its definition)

<div align="center" style="width:500px">

<a href="#Introduction" data-name="html-menu">Introduction</a> \|
<a href="#Acquire__Install" data-name="html-menu">Acquire, Install</a>
\| <a href="#Run__Display" data-name="html-menu">Run, Display</a> \|
<a href="#Use" data-name="html-menu">Use</a> \|
<a href="#Copyright__Version" data-name="html-menu">Copyright,
Version</a>

</div>

</div>

</div>

<div class="article_wrapper">

<div class="roundcorner_16_parch_content">

<div align="center">

<div style="width:640px;height:360px;">

<img src="resources/HDTVTestPattern.png"
title="Click me for full-size &amp; full-screen" id="myimage"
style="width:100%;" onclick="fullScreen(this);" />  
Figure 1: HDTV Test Pattern image  
(small scale, click image for full size and full-screen display)

</div>

</div>

<span id="Introduction"
data-name="html-menu"></span><span class="article_subtopic">Introduction</span>

> After it expired without warning (and after eight trouble-free years
> of service), I recently replaced my big, old Pioneer plasma panel. The
> new panel is a Sony LCD panel with all the bells & whistles I had
> realized I was missing with the old panel.
>
> Because the old panel didn't have HDMI sockets, I hadn't adopted this
> technology, but the new panel — and every other piece of gear I own —
> has HDMI sockets. I decided it was time.
>
> HDMI is controversial on the ground that it protects the data stream
> and prevents copying, even copying of content that the user owns. It
> can be looked on as yet another step toward complete behavioral
> control of electronic media consumers. But apart from this legitimate
> grievance, HDMI is a terrific technology.
>
> HDMI eliminates the only analog link in the chain between a digital
> camera, a digital content delivery stream, and a digital display
> panel. And the result is just what you would expect — much better
> images, much more consistent in quality from one source to another.
>
> But in the midst of this digital technology, there's one element that
> needs user attention — the panel itself. Your display panel, by being
> in your environment with its temperatures, line voltages, and ambient
> lighting, requires a bit of fine-tuning to deliver the best results.
>
> I realized this, so I decided to look for an "official" testing and
> adjustment method. I found a nice collection of dynamic test patterns
> called
> ["AVSHD709"](http://www.avsforum.com/avs-vb/showthread.php?t=948496),
> available in a number of formats. In its most common embodiment, this
> is an ISO disk image file meant to be burned onto a writable DVD,
> which is then displayed with your DVD/Blu-ray player. I recommend this
> source for high-quality patterns — and here is [another
> source](http://www.wuala.com/alluringreality/Public/) for the same
> content.
>
> But while wading through all the patterns and tutorials on the
> AVSHD709 DVD I quickly realized there were only a few tests and
> adjustments relevant to a home theater flat panel — overscan,
> brightness, contrast, color, and hue. I decided to create a single,
> easily accessed test pattern generator that automatically adjusts to
> the size of your display, explains itself, and displays the most
> important test content. This project is the result.

<span id="Acquire__Install"
data-name="html-menu"></span><span class="article_subtopic">Acquire,
Install</span>

> HDTVTestPattern is a Java program that will run on virtually any
> platform — and if you have a platform it won't run on, I have a backup
> plan for you — I provide the image it creates for a 1920x1080 display
> as a PNG grahic image. Here are the download options:
>
> - [HDTVTestPattern.jar](resources/HDTVTestPattern.jar) — the Java
>   program.
> - [HDTVTestPattern.png](resources/HDTVTestPattern.png) — a 1920x1080
>   size graphic of the Java program's output.
> - [HDTVTestPattern_source.tar.bz2](resources/HDTVTestPattern_source.tar.bz2)
>   — a source archive for the Java program, organized as a NetBeans
>   project, released under the
>   [GPL](http://www.gnu.org/copyleft/gpl.html).
>
> To display the graphic image linked above, just click its link. To
> download it, right-click the link and choose "Save as ..." or "Save
> link as ...", depending on your browser's menu options.
>
> To "install" the Java program, just download the first choice in the
> above list and place it anywhere convenient.

<span id="Run__Display"
data-name="html-menu"></span><span class="article_subtopic">Run,
Display</span>

> There are a number of ways to get the HDTVTestPattern content onto
> your flat panel. The easiest is obviously to connect an HDMI cable
> between your computer and your panel (an increasingly frequent step
> taken by people who want to gain access to Web content for their home
> theaters), then run the Java program downloaded in the above step.
>
> To run the Java program from Windows, just click the jar file you
> downloaded earlier. If you have Java installed on your computer, the
> program will run. If you don't have Java installed, [get it
> here](http://java.com) — it's free.
>
> To run the Java program from Linux, open a shell in the directory
> where HDTVTestPattern.jar is located and type:
>
> >     java -jar HDTVTestPattern.jar
> >                 
>
> As above, if you don't have Java installed, you can [get it
> here](http://java.com) — it's free.
>
> If you want to generate a graphic image as shown above, for use where
> Java won't be available, run the program this way:
>
> >     java -jar HDTVTestPattern.jar -f
> >                 
>
> (Note the "-f" argument at the right.)

<span id="Use"
data-name="html-menu"></span><span class="article_subtopic">Use</span>

> Since I don't know what kind of panel you have, for this step I can
> only offer generic advice:
>
> 1.  Most panels are factory adjusted to provide a garish display of
>     saturated color and extreme picture settings. This is based on
>     market research of typical consumers and what propels them to buy
>     a panel in the first place.
>
> 2.  In this section, we will make settings more likely to please the
>     eye of someone watching a nature program, or a science
>     documentary, than a rerun of the Gong Show.
>
> 3.  At the top of the test pattern is the size of your panel in
>     pixels. For true HDTV it should be 1920x1080 pixels. If this is
>     not the size of your display, you're not watching HDTV. This may
>     or may not be a matter of concern to you, but it's likely that the
>     test pattern won't display correctly on substantially smaller
>     displays.
>
> 4.  Next, under "Basic Settings," you will see a notice about the
>     white border surrounding the test pattern. If you can't see this
>     white border, by all means adjust your panel's display area to a
>     setting variously called "full pixel" or "full scan". For
>     old-style analog vacuum-tube displays,
>     [overscan](http://en.wikipedia.org/wiki/Overscan) was a "good
>     thing™", but with geometrically perfect flat panels, it serves no
>     purpose — indeed, if you think about it, with overscan you're
>     throwing away part of the image you spent so much to acquire.
>
> 5.  Moving on, we come to what is probably the single most important
>     setting — black level. This adjustment is usually made with your
>     panel's brightness control. Adjust your panel's control so the
>     brightness levels at index "16" (the "Black Reference" level) and
>     farther to the left are black — indistinguishable from their
>     surroundings. It may be better to conduct this adjustment in a
>     dark room, or if not dark, in typical viewing circumstances.
>
> 6.  The next adjustment is the white-level equivalent of the above
>     dark setting. Use your panel's "Picture" or "Contrast" control for
>     this setting, and adjust it so the white levels at "White
>     Reference" and to the right are indistinguishable.
>
> 7.  In much the same way, but while monitoring the color bars, adjust
>     the "Color" control so the bars to the right of "White Reference"
>     are indistinguishable.
>
> 8.  In steps 5, 6 and 7 above, the goal is to have clearly visible,
>     even brightness steps from the "Black Reference Level" to the
>     "White Reference" level, and to the right of the white reference
>     level the steps should merge into a single brightness level
>     (technically called "saturation"). Also, on some panels it may be
>     necessary to repeat steps 5, 6 and 7 because they may interact.
>
> 9.  Now for the most-often-abused panel setting — variously called
>     "Hue" or "Tint". For a properly designed panel that isn't broken
>     in some way, the best thing to do is set this control to midrange
>     and forget it. Modern electronics is vastly more reliable and
>     repeatable than older equipment, and the probability that you will
>     need to adjust the tint control is correspondingly small. But if
>     you must, then adjust this control while monitoring the yellow
>     color bar. I've noticed that most people are better able to
>     identify a true yellow (an equal mixture of red and green) than
>     any other color. Chances are, if your color vision is normal and
>     your panel isn't broken, you will discover that your final setting
>     is ... mid-range.
>
> There are other settings that aren't in the purview of this test
> pattern, among which are sharpness and color temperature. Some
> comments:
>
> 1.  For some reason, the manufacturers of my panel (Sony) by default
>     puts the sharpness control at its minimal setting, but normal
>     detail is lost in that setting. I find that a midrange sharpness
>     setting gives the best results — details aren't smeared, and there
>     are no unrealistic artifacts. I find the best way to set sharpness
>     is to view black text on a white background — if the sharpness is
>     set too low, letters will be smeared and not crisp. If set too
>     high, each black letter has a white halo, an artifact of the
>     mathematical method used to increase sharpness. And as with tint
>     adjustment, one often finds the optimal setting is midrange.
>
> 2.  Color temperature adjustment is, to a greater degree than other
>     settings, a matter of personal taste. It's easier to set while
>     watching a typical program than while looking at a test pattern.
>
> Having made these standard adjustments, panel owners are then free to
> make adjustments to suit personal taste. The point of these
> adjustments is to set a baseline for realistic display of video
> content, which one may surmise is the goal of having a modern flat
> panel.

<span id="Copyright__Version"
data-name="html-menu"></span><span class="article_subtopic">Copyright,
Version</span>

> The HDTVTestPattern program and image are copyright 2014, P. Lutus.
> All rights reserved. The Java program is released under the
> [GPL](http://www.gnu.org/copyleft/gpl.html).
>
> Version history:
>
> - Version 2.0 08.30.2014 : On user request, corrected maximum white
>   from 252 to 255.
> - Version 1.0 11.17.2011 : Initial public release.

</div>

</div>

|                           |                                          |                                                                                                                                                   |                                                                  |                                                                  |                                                                                                                                              |
|---------------------------|------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------|------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| [Home](../index.html) \|  | [Java](../BiQuadDesigner/index.html) \|  | BiQuadDesigner FFTExplorer HDTV Test Pattern JDBClient JNX JSQLiteClient JSigGen JTides Home Page JWX MagicLantern OpticalRayTracer PLCalc PLCash | [<img src="../images/leftarrow.png" title="Click for prior page" 
                                                                                                                                                                                                                            data-border="0" />](../FFTExplorer/index.html)                    | [<img src="../images/rightarrow.png" title="Click for next page" 
                                                                                                                                                                                                                                                                                               data-border="0" />](../JDBClient/index.html)                      |  [<img src="../images/addthis16.gif" style="border:0px;" />  Share This Page](../administration/submit.php "Recommend this page to friends") |
